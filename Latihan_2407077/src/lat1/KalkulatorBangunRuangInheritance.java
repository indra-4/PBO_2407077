package lat1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Program Kalkulator Bangun Ruang dengan Inheritance
 * Mendemonstrasikan penggunaan inheritance dalam Java
 * 
 * Konsep Inheritance:
 * - BangunRuang adalah parent class (superclass)
 * - Kubus, Balok, Tabung adalah child class (subclass) yang mewarisi dari BangunRuang
 * - Setiap subclass mengimplementasikan method abstrak dari parent class
 */
public class KalkulatorBangunRuangInheritance {
    static ArrayList<BangunRuang> daftarBangun = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n============================================");
            System.out.println("   Kalkulator Bangun Ruang dengan Inheritance");
            System.out.println("============================================");
            System.out.println("1. Hitung Kubus");
            System.out.println("2. Hitung Balok");
            System.out.println("3. Hitung Tabung");
            System.out.println("4. Tampilkan Semua Hasil Perhitungan");
            System.out.println("5. Bandingkan Volume Bangun Ruang");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    buatKubus();
                    break;
                case 2:
                    buatBalok();
                    break;
                case 3:
                    buatTabung();
                    break;
                case 4:
                    tampilkanSemuaHasil();
                    break;
                case 5:
                    bandingkanVolume();
                    break;
                case 6:
                    System.out.println("\n✓ Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("\n✗ Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        input.close();
    }

    /**
     * Method untuk membuat dan menghitung bangun ruang Kubus
     * Mendemonstrasikan polymorphism melalui inheritance
     */
    static void buatKubus() {
        System.out.print("\nMasukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Membuat objek dari subclass Kubus
        Kubus kubus = new Kubus(sisi);
        
        // Memanggil method dari parent class yang diimplementasikan di subclass
        kubus.hitungVolume();
        kubus.hitungLuasPermukaan();
        
        // Menampilkan hasil
        kubus.tampilkanHasil();
        
        // Menambahkan ke daftar
        daftarBangun.add(kubus);
        System.out.println("✓ Data kubus berhasil ditambahkan ke daftar!");
    }

    /**
     * Method untuk membuat dan menghitung bangun ruang Balok
     */
    static void buatBalok() {
        System.out.print("\nMasukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // Membuat objek dari subclass Balok
        Balok balok = new Balok(panjang, lebar, tinggi);
        
        // Memanggil method yang diimplementasikan di subclass
        balok.hitungVolume();
        balok.hitungLuasPermukaan();
        
        // Menampilkan hasil
        balok.tampilkanHasil();
        
        // Menambahkan ke daftar
        daftarBangun.add(balok);
        System.out.println("✓ Data balok berhasil ditambahkan ke daftar!");
    }

    /**
     * Method untuk membuat dan menghitung bangun ruang Tabung
     */
    static void buatTabung() {
        System.out.print("\nMasukkan jari-jari alas tabung: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        // Membuat objek dari subclass Tabung
        Tabung tabung = new Tabung(jariJari, tinggi);
        
        // Memanggil method yang diimplementasikan di subclass
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();
        
        // Menampilkan hasil
        tabung.tampilkanHasil();
        
        // Menambahkan ke daftar
        daftarBangun.add(tabung);
        System.out.println("✓ Data tabung berhasil ditambahkan ke daftar!");
    }

    /**
     * Method untuk menampilkan semua hasil perhitungan
     * Mendemonstrasikan polymorphism: single method untuk multiple types
     */
    static void tampilkanSemuaHasil() {
        if (daftarBangun.isEmpty()) {
            System.out.println("\n✗ Daftar bangun ruang masih kosong!");
            return;
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("DAFTAR SEMUA PERHITUNGAN BANGUN RUANG");
        System.out.println("=".repeat(50));

        // Polymorphism: loop yang sama untuk type berbeda
        for (int i = 0; i < daftarBangun.size(); i++) {
            BangunRuang bangun = daftarBangun.get(i);
            System.out.printf("\n[%d] %s\n", i + 1, bangun.getNama());
            System.out.printf("    Volume: %.2f\n", bangun.getVolume());
            System.out.printf("    Luas Permukaan: %.2f\n", bangun.getLuasPermukaan());
        }
        System.out.println("\n" + "=".repeat(50));
    }

    /**
     * Method untuk membandingkan volume antar bangun ruang
     * Mendemonstrasikan kegunaan arraylist untuk menyimpan multiple subtypes
     */
    static void bandingkanVolume() {
        if (daftarBangun.size() < 2) {
            System.out.println("\n✗ Minimal ada 2 bangun ruang untuk dibandingkan!");
            return;
        }

        // Mencari bangun dengan volume terbesar
        BangunRuang bangunTerbesar = daftarBangun.get(0);
        for (BangunRuang bangun : daftarBangun) {
            if (bangun.getVolume() > bangunTerbesar.getVolume()) {
                bangunTerbesar = bangun;
            }
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("PERBANDINGAN VOLUME BANGUN RUANG");
        System.out.println("=".repeat(50));

        for (int i = 0; i < daftarBangun.size(); i++) {
            BangunRuang bangun = daftarBangun.get(i);
            String status = bangun == bangunTerbesar ? " ← TERBESAR" : "";
            System.out.printf("[%d] %s: %.2f%s\n", 
                i + 1, bangun.getNama(), bangun.getVolume(), status);
        }

        System.out.printf("\n✓ Bangun dengan volume terbesar: %s (%.2f)\n", 
            bangunTerbesar.getNama(), bangunTerbesar.getVolume());
        System.out.println("=".repeat(50));
    }
}
