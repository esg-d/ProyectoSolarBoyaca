// archivo: models/SistemaSolar.java
package models;

public class SistemaSolar {
    private double capacidadKW;
    private int numeroPaneles;
    private double costoTotal;

    public SistemaSolar(double capacidadKW, int numeroPaneles, double costoTotal) {
        this.capacidadKW = capacidadKW;
        this.numeroPaneles = numeroPaneles;
        this.costoTotal = costoTotal;
    }

    public double getCapacidadKW() { return capacidadKW; }
    public int getNumeroPaneles() { return numeroPaneles; }
    public double getCostoTotal() { return costoTotal; }

    public void setCapacidadKW(double capacidadKW) { this.capacidadKW = capacidadKW; }
    public void setNumeroPaneles(int numeroPaneles) { this.numeroPaneles = numeroPaneles; }
    public void setCostoTotal(double costoTotal) { this.costoTotal = costoTotal; }
}
