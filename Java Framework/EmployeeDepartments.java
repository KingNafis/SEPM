import java.util.HashMap;

public class EmployeeDepartments {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeDeptMap = new HashMap<>();
        
        employeeDeptMap.put(1001, "Engineering");
        employeeDeptMap.put(1002, "Marketing");
        employeeDeptMap.put(1003, "HR");
        employeeDeptMap.put(1004, "Engineering");
        
        for (var entry : employeeDeptMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + 
                              ", Department: " + entry.getValue());
        }
        
        // Access a specific employee
        System.out.println("Employee 1002 is in " + employeeDeptMap.get(1002));
    }
}
