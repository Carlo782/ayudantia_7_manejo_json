package com.example.no_generico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Inicializar listas de personajes
        List<Personaje> magos = inicializarMagos();
        List<Personaje> guerreros = inicializarGuerreros();
        
        // Guardar personajes en archivos JSON (métodos no genéricos)
        guardarPersonajesEnArchivoNoGenerico(magos, "magos_no_generico.json");
        guardarPersonajesEnArchivoNoGenerico(guerreros, "guerreros_no_generico.json");
   
        
        // Leer personajes desde archivos JSON (métodos no genéricos)
        List<Mago> magosDesdeArchivo = leerMagosDesdeArchivoNoGenerico("magos_no_generico.json");
        List<Guerrero> guerrerosDesdeArchivo = leerGuerrerosDesdeArchivoNoGenerico("guerreros_no_generico.json");
        
        // Mostrar personajes leídos desde el archivo (no genérico)
        mostrarPersonajes("Magos (No Genérico)", magosDesdeArchivo);
        mostrarPersonajes("Guerreros (No Genérico)", guerrerosDesdeArchivo);

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

    private static void guardarPersonajesEnArchivoNoGenerico(List<Personaje> personajes, String nombreArchivo) {
        GestorArchivo.guardarListaPersonaje(personajes, nombreArchivo);
        System.out.println("Personajes guardados en " + nombreArchivo + "\n");
    }

    private static List<Mago> leerMagosDesdeArchivoNoGenerico(String nombreArchivo) {
        return GestorArchivo.leerPersonajeListaMago(nombreArchivo);
    }

    private static List<Guerrero> leerGuerrerosDesdeArchivoNoGenerico(String nombreArchivo) {
        return GestorArchivo.leerListaPersonajeGuerrero(nombreArchivo);
    }

    private static void mostrarPersonajes(String tipo, List<? extends Personaje> personajes) {
        System.out.println(tipo + ":");
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
        System.out.println();
    }
}
