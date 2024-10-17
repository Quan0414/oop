public class QLKH {

    public static void inTDKH() {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Ho ten", "Dia chi", "SDT", "Email");
    }
    public static void main(String[] args) {
        KhachHang kh = new KhachHang();
        kh.nhap();
        inTDKH();
        kh.xuat();

    }
}

