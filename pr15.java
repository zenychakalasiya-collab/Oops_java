class Employee {
    String name;
    String department;
    Employee(String n, String d) {
        name = n;
        department = d;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
class Manager extends Employee {
    int teamSize;
    String projectName;
    Manager(String n, String d, int t, String p) {
        super(n, d);
        teamSize = t;
        projectName = p;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Zeny", "IT");
        e.displayDetails();
        System.out.println();
        Employee m = new Manager("Yug", "IT", 8, "AI Project");
        m.displayDetails();
    }
}
