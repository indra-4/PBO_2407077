public class Main {
    public static void main(String[] args) {
        // Menggunakan satu tipe variabel yang sama 
        BangunDatar bd;

        // Objek Persegi
        bd = new Persegi(5.0);
        bd.tampilkan();
        System.out.println();

        // Objek Persegi Panjang
        bd = new PersegiPanjang(8.0, 6.0);
        bd.tampilkan();
        System.out.println();

        // Objek Segitiga
        bd = new Segitiga(12.0, 9.0);
        bd.tampilkan();
    }
}