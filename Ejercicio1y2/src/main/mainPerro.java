package main;

import servicio.PerroServicio;

/**
 *
 * @author elias
 */
public class mainPerro {

    public static void main(String[] args) {
        PerroServicio perro1 = new PerroServicio();

        perro1.cargarPerros();
        perro1.mostrarPerros();
        perro1.removerRaza();
        perro1.mostrarPerros();
        perro1.ordenarRazas();

    }

}
