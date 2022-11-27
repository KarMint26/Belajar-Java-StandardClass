package Java.StandardClass.Karel;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMasukkan Nama : ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Umur : ");
        byte age = scanner.nextByte();

        System.out.println("\nNama Anda Adalah " + name + " | Umur Anda Adalah " + age + " Tahun");

    }
}
