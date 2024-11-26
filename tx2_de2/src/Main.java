import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVienManager manager = new NhanVienManager();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Sap xep danh sach nhan vien theo nam tham nien");
            System.out.println("4. Tim kiem nhan vien theo phong tai chinh va xoa");
            System.out.println("5. Thoat");
            System.out.print("Chon thao tac: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character after nextInt()

            switch (choice) {
                case 1:
                    manager.nhapDsNhanVien();
                    break;
                case 2:
                    manager.hienThiDsNhanVien();
                    break;
                case 3:
                    manager.sapXep();
                    break;
                case 4:
                    manager.timKiemTheoPhong();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        }
    }
}
