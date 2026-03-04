package lat1;

/**
 * Kelas abstrak BangunRuang sebagai superclass/parent class
 * untuk berbagai jenis bangun ruang
 */
public abstract class BangunRuang {
    protected String nama;
    protected double volume;
    protected double luasPermukaan;

    /**
     * Constructor untuk inisialisasi nama bangun ruang
     */
    public BangunRuang(String nama) {
        this.nama = nama;
        this.volume = 0;
        this.luasPermukaan = 0;
    }

    /**
     * Method abstrak untuk menghitung volume
     * harus diimplementasikan oleh subclass
     */
    public abstract void hitungVolume();

    /**
     * Method abstrak untuk menghitung luas permukaan
     * harus diimplementasikan oleh subclass
     */
    public abstract void hitungLuasPermukaan();

    /**
     * Method untuk menampilkan hasil perhitungan
     */
    public void tampilkanHasil() {
        System.out.println("\n=== Hasil Perhitungan " + nama + " ===");
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Luas Permukaan: %.2f\n", luasPermukaan);
    }

    /**
     * Getter untuk mendapatkan nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * Getter untuk mendapatkan volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Getter untuk mendapatkan luas permukaan
     */
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}
