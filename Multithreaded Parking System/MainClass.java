import java.util.Scanner;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        // Create a parking pool with capacity for 5 vehicles waiting
        ParkingPool parkingPool = new ParkingPool(5);
        
        // Create and start 3 parking agents
        for (int i = 1; i <= 3; i++) {
            ParkingAgent agent = new ParkingAgent("Agent-" + i, parkingPool);
            agent.start();
        }
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int vehicleCount = 0;
        
        System.out.println("Parking System Simulation");
        System.out.println("Press Enter to add a new vehicle or type 'exit' to quit");
        
        while (vehicleCount < 15) {  // Limit to 15 vehicles for demo
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            // Generate random license plate
            String licensePlate = generateLicensePlate(random);
            RegistrarParking parking = new RegistrarParking(licensePlate);
            
            parkingPool.addParkingRequest(parking);
            vehicleCount++;
            
            System.out.println("Current vehicles waiting: " + parkingPool.getCurrentOccupancy());
        }
        
        // Wait for all parking requests to be processed
        while (parkingPool.getCurrentOccupancy() > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        
        System.out.println("All vehicles processed. Parking system shutting down.");
        scanner.close();
    }
    
    private static String generateLicensePlate(Random random) {
        // Generate format: ABC 123
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // 3 random letters
        for (int i = 0; i < 3; i++) {
            sb.append(letters[random.nextInt(letters.length)]);
        }
        
        sb.append(" ");
        
        // 3 random digits
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        
        return sb.toString();
    }
}