import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private final Queue<RegistrarParking> parkingQueue = new LinkedList<>();
    private final int maxCapacity;

    public ParkingPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public synchronized void addParkingRequest(RegistrarParking parking) {
        while (parkingQueue.size() >= maxCapacity) {
            try {
                System.out.println("Parking pool is full. Waiting for available space...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        parkingQueue.add(parking);
        System.out.println("Added parking request: " + parking.getLicensePlate());
        notifyAll();
    }

    public synchronized RegistrarParking assignParking() {
        while (parkingQueue.isEmpty()) {
            try {
                System.out.println("No parking requests available. Agents waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        RegistrarParking parking = parkingQueue.remove();
        notifyAll();
        return parking;
    }

    public synchronized int getCurrentOccupancy() {
        return parkingQueue.size();
    }
}