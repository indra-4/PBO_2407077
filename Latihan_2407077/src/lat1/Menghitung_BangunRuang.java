package lat1;
import java.util.Scanner;

public class Menghitung_BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Kalkulator Bangun Ruang ===");
            System.out.println("1. Kubus (Volume & Luas Permukaan)");
            System.out.println("2. Balok (Volume & Luas Permukaan)");
            System.out.println("3. Tabung (Volume & Luas Permukaan)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKubus(input);
                    break;
                case 2:
                    hitungBalok(input);
                    break;
                case 3:
                    hitungTabung(input);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }

    // Method untuk Kubus
    static void hitungKubus(Scanner input) {
        System.out.print("Masukkan panjang sisi: ");
        double s = input.nextDouble();
        double volume = Math.pow(s, 3);
        double luas = 6 * Math.pow(s, 2);
        
        System.out.printf("Volume Kubus: %.2f\n", volume);
        System.out.printf("Luas Permukaan Kubus: %.2f\n", luas);
    }

    // Method untuk Balok
    static void hitungBalok(Scanner input) {
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();
        
        double volume = p * l * t;
        double luas = 2 * (p*l + p*t + l*t);
        
        System.out.printf("Volume Balok: %.2f\n", volume);
        System.out.printf("Luas Permukaan Balok: %.2f\n", luas);
    }

    // Method untuk Tabung
    static void hitungTabung(Scanner input) {
        System.out.print("Masukkan jari-jari alas: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();
        
        double volume = Math.PI * Math.pow(r, 2) * t;
        double luas = 2 * Math.PI * r * (r + t);
        
        System.out.printf("Volume Tabung: %.2f\n", volume);
        System.out.printf("Luas Permukaan Tabung: %.2f\n", luas);
    }
}