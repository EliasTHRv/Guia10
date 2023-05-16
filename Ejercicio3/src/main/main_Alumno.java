package main;

import servicio.alumnoServicio;

/**
 *
 * @author elias
 */
public class main_Alumno {

    public static void main(String[] args) {
        alumnoServicio clase1 = new alumnoServicio();

        clase1.crearClase();
        clase1.notaFinal();
    }

}
