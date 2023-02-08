package org.example.model;

public class Cliente extends Persona{
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public Cliente(int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }


    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito + super.toString()+
                '}';
    }
}
