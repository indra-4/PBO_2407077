package lat6;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("--- Bangun Datar ---");
        System.out.println("Luas: " + bangunDatar.hitungLuas());
        System.out.println("Keliling: " + bangunDatar.hitungKeliling());
        
        System.out.println("\n--- Persegi (sisi = 5) ---");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
        
        System.out.println("\n--- Lingkaran (r = 7) ---");
        System.out.println("Luas: " + String.format("%.2f", lingkaran.hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", lingkaran.hitungKeliling()));
    }
}
