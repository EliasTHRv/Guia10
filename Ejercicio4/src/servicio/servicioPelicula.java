package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere crear otra Pelicula o no.
 *
 * @author elias
 */
public class servicioPelicula {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> cine;
    private Pelicula peli;

    public servicioPelicula() {
        this.cine = new ArrayList<>();
        this.peli = new Pelicula();
    }

    public void cargarCine() {
//        ArrayList<Pelicula> cine = new ArrayList<>();
        String confirmacion = "";
        do
        {
            Pelicula peli = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula: ");
            peli.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director: ");
            peli.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula (en horas)");
            peli.setDuracion(leer.nextInt());

            cine.add(peli);
            System.out.println("Quiere cargar otra pelicula? S/N");
            confirmacion = leer.next();
            System.out.println("-----------");

        } while (confirmacion.equalsIgnoreCase("s"));

    }

    //Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {

        for (Pelicula pelicula : cine)
        {
            System.out.println(pelicula.toString());
        }
    }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    public void pelisMayor() {
        for (Pelicula pelicula : cine)
        {
            if (pelicula.getDuracion() > 1)
            {
                System.out.println("La pelicula que supera 1 hora de duracion: " + pelicula.getTitulo());
            }
        }
    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenarPelisMaMe() {
        Collections.sort(cine, Pelicula.compararDuracion);
        Collections.reverse(cine);
        System.out.println("Las pelis ordenadas de mayor a menor por duración: ");
        for (Pelicula pelicula : cine)
        {
            System.out.println(pelicula.getTitulo() + " con duración de " + pelicula.getDuracion());
        }
    }

//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarPelisMeMa() {
        Collections.sort(cine, Pelicula.compararDuracion);
        for (Pelicula pelicula : cine)
        {
            System.out.println(pelicula.getTitulo() + " con duración de " + pelicula.getDuracion());
        }

    }

    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPelisTitulo() {
        Collections.sort(cine, Pelicula.compararTitulo);
        System.out.println("Las peliculas ordenadas alfabeticamente: ");
        for (Pelicula pelicula : cine)
        {
            System.out.println(pelicula.getTitulo());
        }

    }

//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPelisDirector() {
        Collections.sort(cine, Pelicula.compararDirector1);
        System.out.println("Las peliculas ordenada alfabeticamente por su director: ");
        for (Pelicula pelicula : cine)
        {
            System.out.println(pelicula.getDirector());
        }

    }
}
