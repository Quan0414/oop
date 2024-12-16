public interface IEmployeeManager {
    void addEmployee(Employee e);
    void editEmployee(Employee e);
    Employee searchEmployee(String fullName);
    double getTotalSalary();
}
