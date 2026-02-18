package lat1;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Method tampil
    void tampil() {
        System.out.println("=== Perhitungan Persegi Panjang ===");
    }

    // Setter & Getter untuk Panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    // Setter & Getter untuk Lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    // Method untuk Menghitung Luas secara otomatis
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk Menghitung Keliling secara otomatis
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Menghitung {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        
        p.tampil();
        
        // Cukup set panjang dan lebar saja
        p.setPanjang(20);
        p.setLebar(5);
        
        // Luas dan Keliling akan terhitung otomatis
        System.out.println("Panjang  : " + p.getPanjang());
        System.out.println("Lebar    : " + p.getLebar());
        System.out.println("Luas     : " + p.getLuas());
        System.out.println("Keliling : " + p.getKeliling());
    }
} 