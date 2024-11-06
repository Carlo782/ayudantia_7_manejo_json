package com.example.no_generico;

public class Mago extends Personaje{
    
    private int magia;
    private String hechizo;

    public Mago(String nombre, int vida, int ataque, int defensa, int magia, String hechizo) {
        super(nombre, vida, ataque, defensa);
        this.magia = magia;
        this.hechizo = hechizo;
    }

    public Mago() {
    }


    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public String toString() {
        return "Mago{"+ super.toString() + "magia= " + magia + ", hechizo= " + hechizo + '}';
    }

}
