package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<Patient>();

        System.out.println("Nhap so benh nhan: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            Patient patient = new Patient();
            patient.nhap();
            patients.add(patient);
        }

        String ma = scanner.nextLine();
        System.out.println("Nhap ma benh nhan can tim: ");
        ma = scanner.nextLine();

        for(int i = 0; i < n; i++) {
            if(patients.get(i).getPatientCode().equals(ma)) {
                System.out.println("Benh nhan can tim la: " + patients.get(i).getPatientFullname());
            }
        }
        System.out.println("mbn can xoa: ");
        String x = scanner.nextLine();
        for(int i = 0; i < n; i++) {
            if(patients.get(i).getPatientCode().equals(x)) {
                patients.remove(i);
                break;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(patients.get(i).getPatientFullname());
        }

        scanner.close();

    }
}
