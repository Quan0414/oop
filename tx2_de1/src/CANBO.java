import java.util.Scanner;

public class CANBO {
    private String maCanBo;
    private String hoTen;
    private String ngaySinh;
    private int namTD;

    public CANBO() {}

    public CANBO(String maCanBo, String hoTen, String ngaySinh, int namTD) {
        this.maCanBo = maCanBo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.namTD = namTD;
    }

    public String getMaCanBo() {
        return maCanBo;
    }

    public void setMaCanBo(String maCanBo) {
        this.maCanBo = maCanBo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getNamTD() {
        return namTD;
    }

    public void setNamTD(int namTD) {
        this.namTD = namTD;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can bo: ");
        this.maCanBo = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap nam tham nien: ");
        this.namTD = sc.nextInt();
    }

    @Override
    public String toString() {
        return "CANBO{" +
                "maCanBo='" + maCanBo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", namTD=" + namTD +
                '}';
    }

    public void hienThi() {
        System.out.println(this.toString());
    }
}
