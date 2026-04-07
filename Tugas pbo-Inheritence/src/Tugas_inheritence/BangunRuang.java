package Tugas_inheritence;

// 2. Class ini merupakan turunan dari class BangunDatar
public class BangunRuang extends BangunDatar {
    // Atribut tambahan khusus untuk BangunRuang (dienkapsulasi)
    private int tinggi;

    // Constructor BangunRuang
    public BangunRuang(int panjang, int lebar, int tinggi) {
        // Keyword 'super' memanggil constructor dari class induk (BangunDatar)
        // Ini memenuhi aturan 5b: Gunakan kembali atribut yang tersedia
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume
    public int hitungVolume() {
        // Keyword 'super' memanggil method hitungLuas() dari class induk
        // Ini memenuhi aturan 5a: Tidak mengulang kode (DRY - Don't Repeat Yourself)
        return super.hitungLuas() * this.tinggi;
    }
}