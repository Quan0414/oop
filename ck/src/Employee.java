import java.util.Scanner;

public class Employee extends User{
    private int basicSalary;
    private String department;

    public Employee() {
    }

    public Employee(String id, String name, String fullName, Double cosalary, int basicSalary, String department) {
        super(id, name, fullName, cosalary);
        this.basicSalary = basicSalary;
        this.department = department;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap luong co ban: ");
        basicSalary = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap phong ban: ");
        department = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "basicSalary=" + basicSalary +
                ", department='" + department + '\'' +
                "} " + super.toString();
    }

    @Override
    public Double getSalary() {
        double phuCap = 0.0;
        if (department.equalsIgnoreCase("Nhân sự")) {
            phuCap = 1.0;
        } else if (department.equalsIgnoreCase("Kinh doanh")) {
            phuCap = 1.1;
        } else if (department.equalsIgnoreCase("Công nghệ")) {
            phuCap = 1.15;
        } else {
            phuCap = 1.2;
        }

        return getCosalary() * getBasicSalary() * phuCap;
    }


}
