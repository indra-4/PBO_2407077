public class Main {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR PESANAN ===");
        
        // Membuat objek pesanan (Nama, Harga, Jumlah)
        MenuItem pesanan1 = new MenuItem("Nasi Goreng", 25000.0, 2);
        MenuItem pesanan2 = new MenuItem("Soda Gembira", 15000.0, 3);
        MenuItem pesanan3 = new MenuItem("Ayam Penyet", 30000.0, 1);
        

        // Menampilkan rincian masing-masing pesanan
        pesanan1.tampilkan();
        System.out.println("------------------------");
        pesanan2.tampilkan();
        System.out.println("------------------------");
        pesanan3.tampilkan();
        System.out.println("------------------------");

        // Menjumlahkan total keseluruhan pesanan
        double totalAkhir = pesanan1.hitungTotal() + pesanan2.hitungTotal() + pesanan3.hitungTotal();

        System.out.println("TOTAL KESELURUHAN: Rp" + totalAkhir);
    }
}