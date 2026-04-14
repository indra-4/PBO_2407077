package Tugas_inheritence;
public class Mahasiswa extends Manusia {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        // 'super' di sini memanggil constructor Manusia untuk isi nama
        super(nama); 
        this.nim = nim;
    }

    // Kita 'Override' atau modifikasi cara perkenalan si Anak
    @Override
    public void perkenalan() {
        // Memanggil method perkenalan milik Orang Tua dulu
        super.perkenalan(); 
        System.out.println("NIM saya adalah " + this.nim);
    }
}