package com.example.todo_en_uno;

import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorArchivo {

    private static final ObjectMapper mapper = new ObjectMapper();


    // Opción Dos: Métodos no genéricos para leer un personaje y lista de personajes
    // de tipo Personaje

    // Método no genérico para guardar un solo personaje de tipo Personaje en un
    // archivo JSON
    public static void guardarPersonaje(Personaje personaje, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), personaje);
            System.out.println("Personaje guardado en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar el personaje en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método no genérico para guardar una lista de personajes de tipo Personaje en
    // un archivo JSON
    public static void guardarListaPersonaje(List<Personaje> lista, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), lista);
            System.out.println("Lista de personajes guardada en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar la lista de personajes en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método no genérico para leer un solo mago desde un archivo JSON
    public static Personaje leerPersonaje(String nombreArchivo) {
        try {
            return mapper.readValue(new File(nombreArchivo), Personaje.class);
        } catch (Exception e) {
            System.err.println("Error al leer el personaje desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

    // Método no genérico para leer una lista de magos desde un archivo JSON
    public static List<Personaje> leerPersonajeLista(String nombreArchivo) {
        try {
            return mapper.readValue(new File(nombreArchivo),
                    mapper.getTypeFactory().constructCollectionType(List.class, Personaje.class));
        } catch (Exception e) {
            System.err.println("Error al leer la lista de personajes desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

}
