import java.util.Scanner;

public class GIANGVIEN extends CANBO {
    private String khoaCT;
    private String trinhDo;
    private String chuyenMon;

    public GIANGVIEN() {
    }

    public GIANGVIEN(String maCanBo, String hoTen, String ngaySinh, int namTD, String khoaCT, String trinhDo, String chuyenMon) {
        super(maCanBo, hoTen, ngaySinh, namTD);
        this.khoaCT = khoaCT;
        this.trinhDo = trinhDo;
        this.chuyenMon = chuyenMon;
    }

    public String getKhoaCT() {
        return khoaCT;
    }

    public void setKhoaCT(String khoaCT) {
        this.khoaCT = khoaCT;
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
        System.out.println("Nhap khoa cong tac: ");
        this.khoaCT = sc.nextLine();
        System.out.println("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.println("Nhap chuyen mon: ");
        this.chuyenMon = sc.nextLine();
    }

    @Override
    public String toString() {
        return "GIANGVIEN{" +
                super.toString() +
                "khoaCT='" + khoaCT + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", chuyenMon='" + chuyenMon + '\'' +
                "} ";
    }

    @Override
    public void hienThi() {
        System.out.println(this.toString());
    }
}
