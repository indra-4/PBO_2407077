package Tugas_inheritence;

public class Main {
    public static void main(String[] args) {
        // 3a, 3b, 3c. Menyiapkan data pengujian
        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        // Melakukan instansiasi objek BangunRuang
        BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);
        Mahasiswa mhs = new Mahasiswa("Rama", "2407077");
        mhs.perkenalan();

        // 4a & 4b. Menampilkan hasil
        System.out.println("=== Hasil Perhitungan Objek ===");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Tinggi  : " + tinggi);
        System.out.println("-------------------------------");
        
        // Memanggil method hitungLuas (yang diwariskan) dan hitungVolume
        System.out.println("Luas Alas : " + balok.hitungLuas());
        System.out.println("Volume    : " + balok.hitungVolume());
    }
}