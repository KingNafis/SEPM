public class RegistrarParking {
    private static int parkingCounter = 0;
    private final int parkingId;
    private final String licensePlate;
    private final long arrivalTime;

    public RegistrarParking(String licensePlate) {
        this.parkingId = ++parkingCounter;
        this.licensePlate = licensePlate;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getParkingId() {
        return parkingId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Parking #" + parkingId + " for " + licensePlate + " (arrived at: " + arrivalTime + ")";
    }
}