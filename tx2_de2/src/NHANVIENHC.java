import java.util.Scanner;

public class NHANVIENHC extends CANBO {
    private String phongBan;
    private String trinhDo;
    private String chuyenMon;

    public NHANVIENHC() {
    }

    public NHANVIENHC(String maCB, String hoTen, String ngaySinh, int namTD, String phongBan, String trinhDo, String chuyenMon) {
        super(maCB, hoTen, ngaySinh, namTD);
        this.phongBan = phongBan;
        this.trinhDo = trinhDo;
        this.chuyenMon = chuyenMon;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap phong ban: ");
        this.phongBan = sc.nextLine();
        System.out.println("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.println("Nhap chuyen mon: ");
        this.chuyenMon = sc.nextLine();

    }

    @Override
    public String toString() {
        return "NHANVIENHC{" +
                "maCB='" + getMaCB() + '\'' +
                ", hoTen='" + getHoTen() + '\'' +
                ", ngaySinh='" + getNgaySinh() + '\'' +
                ", namTD='" + getNamTD() + '\'' +
                ", phongBan='" + phongBan + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", chuyenMon='" + chuyenMon + '\'' +
                '}';
    }

    public void hienThi() {
        System.out.println(toString());
    }

}
