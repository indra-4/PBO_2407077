package Tugas_inheritence;

public class BangunDatar {
    // 1a & 1b. Atribut dienkapsulasi menggunakan 'private'
    private int panjang;
    private int lebar;

    // 1c. Constructor untuk mengisi nilai atribut
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // 1d. Method untuk menghitung luas
    public int hitungLuas() {
        return this.panjang * this.lebar;
    }

    // (Opsional) Getter jika nilai panjang dan lebar ingin diakses langsung dari luar class
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}