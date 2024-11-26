import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVienManager manager = new GiangVienManager();

        while (true) {
            System.out.println("1. Nhap danh sach giang vien");
            System.out.println("2. Hien thi danh sach giang vien");
            System.out.println("3. Sap xep danh sach theo nam tham nien");
            System.out.println("4. Tim kiem giang vien theo khoa CNTT va xoa");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng thừa sau khi nhập số

            switch (choice) {
                case 1:
                    manager.nhapDanhSachGiangVien();
                    break;
                case 2:
                    manager.hienThiDanhSachGiangVien();
                    break;
                case 3:
                    manager.sapXep();
                    break;
                case 4:
                    manager.timKiemTheoKhoa();
                    break;
                case 5:
                    System.out.println("Thoat!");
                    return;
                default:
                    System.out.println("Chuc nang khong hop le. Vui long chon lai.");
            }
        }
    }
}
