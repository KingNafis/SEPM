import java.util.TreeMap;

class StudentDetails {
    String name;
    int age;
    String department;
    
    StudentDetails(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Dept: " + department;
    }
}

public class StudentMap {
    public static void main(String[] args) {
        TreeMap<Integer, StudentDetails> studentMap = new TreeMap<>();
        
        studentMap.put(101, new StudentDetails("Alice", 20, "Computer Science"));
        studentMap.put(102, new StudentDetails("Bob", 21, "Electrical Engineering"));
        studentMap.put(103, new StudentDetails("Charlie", 19, "Mathematics"));
        
        for (var entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}