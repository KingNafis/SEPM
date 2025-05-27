public class ParkingAgent extends Thread {
    private final ParkingPool parkingPool;
    private final String agentName;

    public ParkingAgent(String name, ParkingPool pool) {
        this.agentName = name;
        this.parkingPool = pool;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Get a parking request from the pool
                RegistrarParking parking = parkingPool.assignParking();
                
                if (parking != null) {
                    System.out.println(agentName + " is processing parking for " + parking.getLicensePlate());
                    
                    // Simulate time taken to park the vehicle
                    Thread.sleep((long) (Math.random() * 3000));
                    
                    System.out.println(agentName + " successfully parked " + parking.getLicensePlate());
                }
            } catch (InterruptedException e) {
                System.out.println(agentName + " was interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}