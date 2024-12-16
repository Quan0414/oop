import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagerImpl employeeManager = new EmployeeManagerImpl();


        while (true) {
            System.out.println("1. Add employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Search employee");
            System.out.println("4. Get total salary");
            System.out.println("5. Exit");
            System.out.println("Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    Employee e = new Employee();
                    employeeManager.addEmployee(e);
                    break;
                case 2:
                    System.out.println("Nhap ten nhan vien can sua: ");
                    String fullName = sc.nextLine();
                    Employee employee = employeeManager.searchEmployee(fullName);
                    if (employee != null) {
                        employeeManager.editEmployee(employee);
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten nhan vien can tim: ");
                    String fullNameSearch = sc.nextLine();
                    Employee employeeSearch = employeeManager.searchEmployee(fullNameSearch);
                    if (employeeSearch != null) {
                        System.out.println(employeeSearch);
                    }
                    break;
                case 4:
                    System.out.println("Tong luong: " + employeeManager.getTotalSalary());
                    break;
                case 5:
                    return;

            }
        }


    }
}