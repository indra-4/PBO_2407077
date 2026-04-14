public class Segitiga extends BangunDatar {
    
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi); // [cite: 6]
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB(); // Luas = 1/2 * a * t [cite: 15]
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + getVarA()); // [cite: 21]
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
    }
}