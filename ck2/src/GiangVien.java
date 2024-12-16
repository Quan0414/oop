import java.util.Scanner;

public class GiangVien extends CanBoNV{
    private String hocHamHocVi;
    private String khoaCt;
    private int soGioDay;

    public GiangVien() {
    }

    public GiangVien(String maCBNV, String hoTen, int namTuyenDung, Double heSoLuong,
                     Double heSoPC, String hocHamHocVi, String khoaCt, int soGioDay ) {
        super(maCBNV, hoTen, namTuyenDung, heSoLuong, heSoPC);
        this.hocHamHocVi = hocHamHocVi;
        this.khoaCt = khoaCt;
        this.soGioDay = soGioDay;

    }

    public String getHocHamHocVi() {
        return hocHamHocVi;
    }

    public void setHocHamHocVi(String hocHamHocVi) {
        this.hocHamHocVi = hocHamHocVi;
    }

    public String getKhoaCt() {
        return khoaCt;
    }

    public void setKhoaCt(String khoaCt) {
        this.khoaCt = khoaCt;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public int luongBS() {
        if (hocHamHocVi.equalsIgnoreCase("TS")) {
            return 7000000;
        } else if (hocHamHocVi.equalsIgnoreCase("PGS")) {
            return 9000000;
        } else if (hocHamHocVi.equalsIgnoreCase("GS")) {
            return 12000000;
        }
        return 0;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap hoc ham hoc vi: ");
        hocHamHocVi = sc.nextLine();
        System.out.println("Nhap khoa cong tac: ");
        khoaCt = sc.nextLine();
        System.out.println("Nhap so gio day: ");
        soGioDay = sc.nextInt();
        sc.nextLine();

    }

    @Override
    public double getSalary() {

        return (getHeSoLuong() + getHeSoPC()) * 2340000 * 1.25 + soGioDay * 200000 + luongBS();
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString() +
                "hocHamHocVi='" + hocHamHocVi + '\'' +
                ", khoaCt='" + khoaCt + '\'' +
                ", soGioDay=" + soGioDay +
                ", luongBS=" + luongBS() +
                "} ";
    }
}
