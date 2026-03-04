# Program Kalkulator Bangun Ruang dengan Inheritance

## Konsep Inheritance (Pewarisan) dalam Program ini

Inheritance adalah salah satu prinsip OOP (Object-Oriented Programming) yang memungkinkan sebuah class mewarisi properties dan methods dari class lain.

### Struktur Inheritance

```
BangunRuang (Parent Class/Superclass)
    ↓
    ├── Kubus (Child Class/Subclass)
    ├── Balok (Child Class/Subclass)
    └── Tabung (Child Class/Subclass)
```

## Penjelasan File-file Program

### 1. **BangunRuang.java** (Parent Class)
- Class abstract yang menjadi superclass untuk semua bangun ruang
- Mengandung:
  - **Properties**: nama, volume, luasPermukaan
  - **Method abstrak**: hitungVolume(), hitungLuasPermukaan() (harus diimplementasikan subclass)
  - **Method konkret**: tampilkanHasil(), getNama(), getVolume(), getLuasPermukaan()

### 2. **Kubus.java** (Child Class)
- Extends BangunRuang
- Implementasi spesifik untuk kubus:
  - `hitungVolume()`: V = s³
  - `hitungLuasPermukaan()`: LP = 6s²
- Property tambahan: sisi

### 3. **Balok.java** (Child Class)
- Extends BangunRuang
- Implementasi spesifik untuk balok:
  - `hitungVolume()`: V = p × l × t
  - `hitungLuasPermukaan()`: LP = 2(pl + pt + lt)
- Properties tambahan: panjang, lebar, tinggi

### 4. **Tabung.java** (Child Class)
- Extends BangunRuang
- Implementasi spesifik untuk tabung:
  - `hitungVolume()`: V = πr²t
  - `hitungLuasPermukaan()`: LP = 2πr(r + t)
- Properties tambahan: jariJari, tinggi

### 5. **KalkulatorBangunRuangInheritance.java** (Main Program)
- Program utama yang menggunakan semua class dengan inheritance
- Fitur:
  - Menu interaktif
  - Bisa menghitung ketiga bangun ruang
  - Menyimpan hasil dalam ArrayList
  - Menampilkan semua hasil
  - Membandingkan volume antar bangun ruang

---

## Keuntungan Menggunakan Inheritance

1. **Code Reusability** - Tidak perlu menulis ulang method yang sama di setiap class
2. **Maintainability** - Perubahan di parent class otomatis teraplikasi ke child class
3. **Extensibility** - Mudah menambah bangun ruang baru (contoh: Bola, Kerucut, dll)
4. **Polymorphism** - Bisa menggunakan reference parent untuk object child
5. **Organizational** - Struktur code lebih terorganisir dan mudah dipahami

---

## Contoh Polymorphism dalam Program

```java
// Bisa menyimpan berbagai jenis bangun dalam satu ArrayLis
ArrayList<BangunRuang> daftarBangun = new ArrayList<>();
daftarBangun.add(new Kubus(5));      // Kubus adalah BangunRuang
daftarBangun.add(new Balok(3,4,5));  // Balok adalah BangunRuang
daftarBangun.add(new Tabung(2,7));   // Tabung adalah BangunRuang

// Dapat memanggil method yang sama untuk type berbeda
for (BangunRuang bangun : daftarBangun) {
    bangun.hitungVolume();
    bangun.hitungLuasPermukaan();
    bangun.tampilkanHasil();
}
```

---

## Cara Menjalankan Program

1. Compile semua file Java:
   ```bash
   javac src/lat1/BangunRuang.java
   javac src/lat1/Kubus.java
   javac src/lat1/Balok.java
   javac src/lat1/Tabung.java
   javac src/lat1/KalkulatorBangunRuangInheritance.java
   ```

2. Jalankan program:
   ```bash
   java -cp src lat1.KalkulatorBangunRuangInheritance
   ```

---

## Perbedaan dengan Program Sebelumnya

| Aspek | Sebelumnya (Menghitung_BangunRuang) | Dengan Inheritance (KalkulatorBangunRuangInheritance) |
|-------|-----|-----|
| Struktur | Static methods | OOP dengan class dan inheritance |
| Reusability | Low | High |
| Extensibility | Sulit | Mudah |
| Memory | Satu class besar | Multiple organized class |
| Maintenance | Lebih susah | Lebih mudah |
| Polymorphism | Tidak ada | Ada (ArrayList dapat menyimpan berbagai type) |

---

## Keyword Penting dalam Inheritance

- `extends` - Menunjukkan class mewarisi dari parent class
- `abstract` - Method yang harus diimplementasikan oleh subclass
- `@Override` - Annotation untuk menunjukkan method di-override dari parent
- `super()` - Memanggil constructor parent class

