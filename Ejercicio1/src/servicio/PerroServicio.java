package servicio;

import entidad.Perro;
import java.util.ArrayList;
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

            System.out.println("Quiere cargar otro perro? N/ para salir");
            salir = leer.next();
        } while (!salir.equalsIgnoreCase("S"));
        mostrarPerros();
    }

    private void mostrarPerros(){
        
        for (Perro listasPerro : listasPerros)
        {
                    System.out.println(listasPerro.toString());

        }
    }
    
}
