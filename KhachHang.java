import java.util.Scanner;

public class KhachHang {
    String hoTen;
    String diaChi;
    String sdt;
    String email;

    public KhachHang() {

    }

    public KhachHang(String hoTen, String diaChi, String sdt, String email) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("SDT: ");
        sdt = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();        
    }

    

    public void xuat() {
        System.out.printf("%-15s %-15s %-15s %-15s\n", hoTen, diaChi, sdt, email); 
    }
    
   // sc.close();
}
