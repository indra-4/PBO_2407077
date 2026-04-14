public class BangunDatar {
    // Atribut privat (Encapsulation) [cite: 4]
    private double varA;
    private double varB;

    // Constructor dengan 2 parameter [cite: 6]
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor dengan 1 parameter [cite: 6]
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0; 
    }

    // Getter dan Setter untuk akses atribut privat [cite: 4]
    public double getVarA() { return varA; }
    public void setVarA(double varA) { this.varA = varA; }
    public double getVarB() { return varB; }
    public void setVarB(double varB) { this.varB = varB; }

    // Method hitungLuas dengan nilai default 0 [cite: 8]
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan [cite: 9]
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA); // [cite: 11]
        System.out.println("varB: " + varB); // [cite: 12]
    }
}