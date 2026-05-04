public class Menu {
    // Menggunakan protected agar bisa diakses oleh class anaknya (MenuItem)
    protected String namaMenu;
    protected double harga;

    // Constructor
    public Menu(String namaMenu, double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Method hitung total dasar (hanya mengembalikan harga satuan)
    public double hitungTotal() {
        return harga;
    }

    // Method untuk menampilkan info
    public void tampilkan() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga: Rp" + harga);
    }
}   