import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVienImpl giangVien = new GiangVienImpl();
        GiangVien gv1 = new GiangVien();

        giangVien.addGiangVien(gv1);
        giangVien.display();

        giangVien.editGiangVien(gv1);
        giangVien.display();

        giangVien.searchGiangVien("GV001");

        System.out.println("Tong luong: " + giangVien.getTotalSalary("TS"));


    }
}