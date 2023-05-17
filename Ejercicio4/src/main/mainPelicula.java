package main;

import servicio.servicioPelicula;

/**
 *
 * @author elias
 */
public class mainPelicula {

    public static void main(String[] args) {
        servicioPelicula cine1 = new servicioPelicula();

        cine1.cargarCine();
        cine1.mostrarPeliculas();
        System.out.println("-----------");
        System.out.println(" ");
        cine1.pelisMayor();
        System.out.println("-----------");
        cine1.ordenarPelisMaMe();
        System.out.println("-----------");
        cine1.ordenarPelisMeMa();
        System.out.println("-----------");
        cine1.ordenarPelisTitulo();
        System.out.println("-----------");
        cine1.ordenarPelisDirector();
        
    }

}
