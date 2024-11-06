package com.example.no_generico;

public class Guerrero extends Personaje{
    
    private int fuerza;
    private String arma;

    public Guerrero(String nombre, int vida, int ataque, int defensa, int fuerza, String arma) {
        
        super(nombre, vida, ataque, defensa);
        this.fuerza = fuerza;
        this.arma = arma;
    }

    public Guerrero() {
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Guerrero{"+ super.toString() + "fuerza= " + fuerza + ", arma= " + arma + '}';
    }
    
}
