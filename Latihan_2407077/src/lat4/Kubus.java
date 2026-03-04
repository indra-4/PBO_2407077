package lat4;

import lat1.BangunRuang;

public class Kubus extends BangunRuang {
    private double sisi;

    
    public Kubus(double sisi) {
        super("Kubus");
        this.sisi = sisi;
    }
    
    @Override
    public void hitungVolume() {
        volume = Math.pow(sisi, 3);
    }

    @Override
    public void hitungLuasPermukaan() {
        luasPermukaan = 6 * Math.pow(sisi, 2);
    }
 
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
