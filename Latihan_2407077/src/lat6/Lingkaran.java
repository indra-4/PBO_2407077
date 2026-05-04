package lat6;

public class Lingkaran extends BangunDatar {
    public double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * r * r;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}
