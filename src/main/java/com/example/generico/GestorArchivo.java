package com.example.generico;

import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorArchivo {

    private static final ObjectMapper mapper = new ObjectMapper();

    // Opción Uno: Utilización de Genéricos

    // Método genérico para guardar un solo personaje en un archivo JSON
    public static <T> void guardarPersonajeGenerico(T personaje, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), personaje);
            System.out.println("Personaje guardado en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar el personaje en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método genérico para guardar una lista de personajes en un archivo JSON
    public static <T> void guardarListaPersonajeGenerico(List<T> lista, String nombreArchivo) {
        try {
            mapper.writeValue(new File(nombreArchivo), lista);
            System.out.println("Lista de personajes guardada en " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar la lista de personajes en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    // Método genérico para leer un solo personaje desde un archivo JSON
    public static <T> T leerPersonajeGenerico(String nombreArchivo, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File(nombreArchivo), claseTipo);
        } catch (Exception e) {
            System.err.println("Error al leer el personaje desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

    // Método genérico para leer una lista de personajes desde un archivo JSON
    public static <T> List<T> leerListaPersonajeGenerico(String nombreArchivo, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File(nombreArchivo),
                    mapper.getTypeFactory().constructCollectionType(List.class, claseTipo));
        } catch (Exception e) {
            System.err.println("Error al leer la lista de personajes desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }
}
