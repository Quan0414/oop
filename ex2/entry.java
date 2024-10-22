package ex2;

public class entry {

    public static void xuatTieuDe() {
        System.out.printf("%-15s %-15s %-15s \n", "Ten", "Dia chi", "Luong");
    }

    public static void main(String[] args) {
        LaoDongPhoThong ldpt = new LaoDongPhoThong();
        ldpt.nhap();
        xuatTieuDe();
        ldpt.xuat();

        KiSu ks = new KiSu();
        ks.nhap();
        xuatTieuDe();
        ks.xuat();

    }
}
