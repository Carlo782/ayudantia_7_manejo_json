package com.example.todo_en_uno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Inicializar listas de personajes
        List<Personaje> personajes = inicializarMagos();
        // Guardar personajes en archivos JSON (métodos no genéricos)
        guardarPersonajesEnArchivoNoGenerico(personajes, "magos_y_guerreros.json");

        // Leer personajes desde archivos JSON (métodos no genéricos)
        List<Personaje> personajesLeidos = leerPersonajesDesdeArchivoNoGenerico("magos_y_guerreros.json");

        // Mostrar personajes
        mostrarPersonajes("Personajes leídos", personajesLeidos);
    }

    private static List<Personaje> inicializarMagos() {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Mago("Gandalf", 100, 10, 5, 50, "Rayo"));
        personajes.add(new Mago("Merlin", 100, 10, 5, 50, "Rayo"));
        personajes.add(new Mago("Harry Potter", 100, 10, 5, 50, "Rayo"));
        personajes.add(new Guerrero("Conan", 100, 20, 10, 30, "Espada"));
        personajes.add(new Guerrero("Hercules", 100, 20, 10, 30, "Espada"));
        personajes.add(new Guerrero("Kratos", 100, 20, 10, 30, "Espada"));
        return personajes;
    }

    private static void guardarPersonajesEnArchivoNoGenerico(List<Personaje> personajes, String nombreArchivo) {
        GestorArchivo.guardarListaPersonaje(personajes, nombreArchivo);
        System.out.println("Personajes guardados en " + nombreArchivo + "\n");
    }

    private static List<Personaje> leerPersonajesDesdeArchivoNoGenerico(String nombreArchivo) {
        return GestorArchivo.leerPersonajeLista(nombreArchivo);
    }
    
    private static void mostrarPersonajes(String tipo, List<? extends Personaje> personajes) {
        System.out.println(tipo + ":");
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
        System.out.println();
    }
}
