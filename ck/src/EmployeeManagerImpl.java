import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeManagerImpl implements IEmployeeManager{
    private ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    @Override
    public void addEmployee(Employee e) {
        try {
            e.nhap();
            for (Employee employee : employees) {
                if (employee.getId().equalsIgnoreCase(e.getId())) {
                    System.out.println("Id da ton tai");
                    return;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void editEmployee(Employee e) {
        try {
            System.out.println("Nhap luong co ban moi: ");
            e.setBasicSalary(sc.nextInt());
            sc.nextLine();
            if (e.getBasicSalary() < 0) {
                System.out.println("Luong co ban phai lon hon 0");
                return;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }
    }

    @Override
    public Employee searchEmployee(String fullName) {

        for (Employee employee : employees) {
            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public double getTotalSalary() {
        try {
            double totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary += employee.getSalary();
            }
            return totalSalary;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
