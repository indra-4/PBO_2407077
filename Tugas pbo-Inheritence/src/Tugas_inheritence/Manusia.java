package Tugas_inheritence;
public class Manusia {
    protected String nama;

    // Constructor Orang Tua
    public Manusia(String nama) {
        this.nama = nama;
    }

    public void perkenalan() {
        System.out.println("Halo, nama saya " + this.nama);
    }
}