package com.example.generico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Inicializar listas de personajes
        List<Personaje> magos = inicializarMagos();
        List<Personaje> guerreros = inicializarGuerreros();
        
        guardarPersonajesEnArchivoGenerico(magos, "magos_generico.json");
        guardarPersonajesEnArchivoGenerico(guerreros, "guerreros_generico.json");
           
        // Leer personajes desde archivos JSON (métodos genéricos)
        List<Mago> magosDesdeArchivoGenerico = leerPersonajesDesdeArchivoGenerico("magos_generico.json", Mago.class);
        List<Guerrero> guerrerosDesdeArchivoGenerico = leerPersonajesDesdeArchivoGenerico("guerreros_generico.json", Guerrero.class);

        // Mostrar personajes leídos desde el archivo (genérico)
        mostrarPersonajes("Magos (Genérico)", magosDesdeArchivoGenerico);
        mostrarPersonajes("Guerreros (Genérico)", guerrerosDesdeArchivoGenerico);
    }

    private static List<Personaje> inicializarMagos() {
        List<Personaje> magos = new ArrayList<>();
        magos.add(new Mago("Gandalf", 100, 10, 5, 50, "Rayo"));
        magos.add(new Mago("Merlin", 100, 10, 5, 50, "Rayo"));
        magos.add(new Mago("Harry Potter", 100, 10, 5, 50, "Rayo"));
        return magos;
    }

    private static List<Personaje> inicializarGuerreros() {
        List<Personaje> guerreros = new ArrayList<>();
        guerreros.add(new Guerrero("Conan", 100, 20, 10, 30, "Espada"));
        guerreros.add(new Guerrero("Hercules", 100, 20, 10, 30, "Espada"));
        guerreros.add(new Guerrero("Kratos", 100, 20, 10, 30, "Espada"));
        return guerreros;
    }

  
    private static <T> void guardarPersonajesEnArchivoGenerico(List<T> personajes, String nombreArchivo) {
        GestorArchivo.guardarListaPersonajeGenerico(personajes, nombreArchivo);
        System.out.println("Personajes guardados en " + nombreArchivo + "\n");
    }

    private static <T> List<T> leerPersonajesDesdeArchivoGenerico(String nombreArchivo, Class<T> tipoClase) {
        return GestorArchivo.leerListaPersonajeGenerico(nombreArchivo, tipoClase);
    }

    private static void mostrarPersonajes(String tipo, List<? extends Personaje> personajes) {
        System.out.println(tipo + ":");
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
        System.out.println();
    }
}
