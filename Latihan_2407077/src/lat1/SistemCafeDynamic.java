package lat1;

import java.util.HashMap;
import java.util.Map;

// 1. Class Bahan sekarang punya 'hargaPerSatuan'
class Bahan {
    private String nama;
    private int stok;
    private String satuan;
    private double hargaPerSatuan; // Harga modal per ml/shot/gram

    public Bahan(String nama, int stok, String satuan, double hargaPerSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.satuan = satuan;
        this.hargaPerSatuan = hargaPerSatuan;
    }

    public String getNama() { return nama; }
    public int getStok() { return stok; }
    public String getSatuan() { return satuan; }
    public double getHargaPerSatuan() { return hargaPerSatuan; }

    public void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }
}

// 2. Class MenuMinuman menghitung harga secara Real-Time
class MenuMinuman {
    private String namaMenu;
    private double marginKeuntungan; // Keuntungan yang diambil cafe per cup
    
    // Resep disimpan disini
    private HashMap<Bahan, Integer> resep = new HashMap<>();

    // Constructor tidak lagi minta 'Total Harga', tapi minta 'Margin Keuntungan'
    public MenuMinuman(String namaMenu, double marginKeuntungan) {
        this.namaMenu = namaMenu;
        this.marginKeuntungan = marginKeuntungan;
    }

    // Menambah atau Mengupdate jumlah bahan
    public void setBahan(Bahan bahan, int jumlah) {
        resep.put(bahan, jumlah);
    }

    public String getNamaMenu() { return namaMenu; }

    // FITUR UTAMA: Menghitung harga total secara otomatis
    public double getHargaJual() {
        double totalModal = 0;
        
        // Loop semua bahan di resep, hitung biayanya
        for (Map.Entry<Bahan, Integer> entry : resep.entrySet()) {
            Bahan b = entry.getKey();
            int jumlahPakai = entry.getValue();
            
            // Biaya = Jumlah Pakai * Harga Satuan Bahan
            totalModal += (jumlahPakai * b.getHargaPerSatuan());
        }

        // Harga Jual = Modal Bahan + Keuntungan Cafe
        return totalModal + marginKeuntungan;
    }

    public HashMap<Bahan, Integer> getResep() { return resep; }

    public void tampilkanInfo() {
        System.out.println("=== " + namaMenu + " ===");
        System.out.println("Komposisi & Biaya:");
        
        for (Map.Entry<Bahan, Integer> entry : resep.entrySet()) {
            Bahan b = entry.getKey();
            int jumlah = entry.getValue();
            double biayaBahan = jumlah * b.getHargaPerSatuan();
            
            System.out.println(" - " + b.getNama() + ": " + jumlah + " " + b.getSatuan() + 
                               " (Rp " + (int)biayaBahan + ")");
        }
        System.out.println("Margin Cafe : Rp " + (int)marginKeuntungan);
        System.out.println("TOTAL HARGA : Rp " + (int)getHargaJual()); // Harga otomatis berubah
        System.out.println("---------------------------");
    }
}

// 3. Main Class
public class SistemCafeDynamic {
    
    public static void main(String[] args) {
        // --- TAHAP 1: Setup Bahan Baku & Harga Modal ---
        // Espresso modalnya Rp 3.000 per shot
        Bahan kopiEspresso = new Bahan("Espresso", 100, "shot", 3000); 
        // Air panas modalnya gratis/murah (Rp 10 per ml)
        Bahan airPanas     = new Bahan("Air Panas", 5000, "ml", 10);   
        // Susu modalnya Rp 30 per ml (1 liter = 30.000)
        Bahan susuFresh    = new Bahan("Susu Fresh", 1000, "ml", 30);  

        // --- TAHAP 2: Buat Menu ---
        // Kita set keuntungan cafe Rp 10.000 per cup
        MenuMinuman latte = new MenuMinuman("Caffe Latte", 10000);

        // --- SKENARIO PERTAMA: Resep Standar ---
        System.out.println("\n[1] MEMBUAT RESEP AWAL (Standard)");
        latte.setBahan(kopiEspresso, 1); // 1 shot (Rp 3.000)
        latte.setBahan(susuFresh, 200);  // 200 ml (Rp 6.000)
        // Total Modal: 9.000 + Margin 10.000 = Harga Jual 19.000
        
        latte.tampilkanInfo();

        // --- SKENARIO KEDUA: Mengubah Resep (Tambah Shot) ---
        System.out.println("\n[2] MENGUBAH RESEP (Double Shot)");
        System.out.println("...Menambahkan 1 shot espresso lagi...");
        
        // Kita ubah jumlah espresso jadi 2
        latte.setBahan(kopiEspresso, 2); 
        // Modal nambah 3.000 lagi. Total Modal 12.000 + Margin 10.000 = Harga 22.000
        
        latte.tampilkanInfo();

        // --- SKENARIO KETIGA: Mengurangi Susu ---
        System.out.println("\n[3] MENGUBAH RESEP (Less Milk)");
        System.out.println("...Mengurangi susu jadi 100ml...");
        
        latte.setBahan(susuFresh, 100);
        
        latte.tampilkanInfo();
    }
}