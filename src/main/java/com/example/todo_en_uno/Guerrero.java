package com.example.todo_en_uno;

public class Guerrero extends Personaje{
    
    private String tipo; 
    private int fuerza;
    private String arma;

    public Guerrero(String nombre, int vida, int ataque, int defensa, int fuerza, String arma) {
        
        super(nombre, vida, ataque, defensa);
        this.tipo = "guerrero";
        this.fuerza = fuerza;
        this.arma = arma;
    }

    public Guerrero() {
    }

    public String getTipo() {
        return tipo;
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
