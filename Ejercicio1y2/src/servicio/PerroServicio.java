package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author elias
 */
public class PerroServicio {

    private Scanner leer;
    private ArrayList<Perro> listasPerros;

    public PerroServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listasPerros = new ArrayList<>();
    }

    public void cargarPerros() {
        String salir = " ";

        do
        {
            System.out.println("Ingrese la raza del perro: ");
            String razaPerro = leer.next();
            listasPerros.add(new Perro(razaPerro));

            System.out.println("Quiere cargar otro perro? S/N");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("s"));

    }

    public void mostrarPerros() {

        for (Perro listasPerro : listasPerros)
        {
            System.out.println("La raza es: " + listasPerro.toString());

        }
    }

    //Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
    public void removerRaza() {
        System.out.println("Ingrese la raza de perro a borrar: ");
        String razaAborrar = leer.next();
        boolean razaNoencontrada = true;
        Iterator<Perro> it = listasPerros.iterator();

        while (it.hasNext())
        {
            if (it.next().getRaza().equalsIgnoreCase(razaAborrar))
            {
                it.remove();
                System.out.println("La raza se borro.");
                razaNoencontrada = false;
                break;
            }
        }

        if (razaNoencontrada)
        {
            System.out.println("La raza no se encontro dentro de la lista: ");

        }

    }

    public void ordenarRazas() {
//        Collections.sort(listasPerros);
        Collections.sort(listasPerros, (Perro objeto1, Perro objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));

        System.out.println(listasPerros.toString());

    }
}
