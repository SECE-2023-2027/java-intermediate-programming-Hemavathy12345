package Employee_Payroll;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee Name: ");
    String name = sc.nextLine();
    System.out.println("Enter Employee Salary: ");
    double salary = sc.nextDouble();
    sc.nextLine(); 
    System.out.println("Enter the Manager Name: ");
    String managerName = sc.nextLine();
    System.out.println("Enter Manager Salary: ");
    double managerSalary = sc.nextDouble();
    System.out.println("Enter Manager Bonus: ");
    double managerBonus = sc.nextDouble();
    Employee employee = new Employee(name, salary);
    Manager manager = new Manager(managerName, managerSalary, managerBonus);
    System.out.println("Employee Salary: " + employee.calculateSalary());
    System.out.println("Manager Salary: " + manager.calculateSalary());

    }
}
