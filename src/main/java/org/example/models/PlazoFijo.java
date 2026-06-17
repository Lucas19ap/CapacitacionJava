package org.example.models;

public class PlazoFijo extends Producto{

    private int plazoDias;
    private double tasaInteres;
    private double Ganancia;

    public int getPlazoDias() {
        return plazoDias;
    }

    public void setPlazoDias(int plazoDias) {
        this.plazoDias = plazoDias;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double ganancia) {
        Ganancia = ganancia;
    }

    public void simularVencimiento(){
        Ganancia = saldo * (tasaInteres / 100) * (plazoDias / 365.0);
    }
}
