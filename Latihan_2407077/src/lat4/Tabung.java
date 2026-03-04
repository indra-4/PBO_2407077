package lat4;

import lat1.BangunRuang;

public class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super("Tabung");
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    
    public double getJariJari() {
        return jariJari;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
