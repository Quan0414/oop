import java.util.Scanner;

public abstract class User {
    private String id;
    private String name;
    private String fullName;
    private Double cosalary;

    public User() {
    }

    public User(String id, String name, String fullName, Double cosalary) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.cosalary = cosalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getCosalary() {
        return cosalary;
    }

    public void setCosalary(Double cosalary) {
        this.cosalary = cosalary;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap fullName: ");
        fullName = sc.nextLine();
        System.out.println("Nhap cosalary: ");
        cosalary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", cosalary=" + cosalary +
                '}';
    }

    public abstract Double getSalary();
}
