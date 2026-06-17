package org.example.models;

public class TarjetaCredito extends Producto{

    private double limiteCredito;
    private double saldo.valueOf(0);

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void pagarConTarjeta(double monto){

    }
    public void pagarTarjeta(double monto){

    }
}
