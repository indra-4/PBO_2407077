public class Persegi extends BangunDatar {
    
    public Persegi(double sisi) {
        super(sisi); // Menggunakan constructor 1 parameter [cite: 6]
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); // Luas = sisi * sisi [cite: 15]
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi"); // [cite: 18]
        System.out.println("Sisi: " + getVarA()); // [cite: 19]
        System.out.println("Luas: " + hitungLuas()); // [cite: 20]
    }
}