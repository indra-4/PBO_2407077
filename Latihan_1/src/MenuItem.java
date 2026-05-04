public class MenuItem extends Menu {
    private int jumlah;

    // Constructor mengambil atribut dari parent (super) ditambah jumlah
    public MenuItem(String namaMenu, double harga, int jumlah) {
        super(namaMenu, harga);
        this.jumlah = jumlah;
    }

    // Override: Menghitung total berdasarkan harga dikali jumlah
    @Override
    public double hitungTotal() {
        return harga * jumlah; 
    }

    // Override: Menampilkan detail lengkap beserta subtotalnya
    @Override
    public void tampilkan() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga Satuan: Rp" + harga);
        System.out.println("Jumlah Pesanan: " + jumlah);
        System.out.println("Subtotal: Rp" + hitungTotal());
    }
}