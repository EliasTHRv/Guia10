package servico;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class paisServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Pais> paises;
    private Pais pais1;

    public paisServicio() {
        this.paises = new HashSet<>();
        this.pais1 = new Pais();
    }

    public void cargarPaises() {
        String confirmacion = "";
        do
        {
            Pais pais1 = new Pais();
            System.out.println("Ingrese el nombre del pais; ");
            pais1.setNombrePais(leer.next());
            paises.add(pais1);

            System.out.println("Desea cargar otro pais? S/N");
            confirmacion = leer.next();
        } while (confirmacion.equalsIgnoreCase("S"));
    }

    //Metodo que los ordena alfabeticamente a los paises.
    public void ordenarPaises() {
        //El hashset debe convertirse primero en un ArrayList para poder ordenarlo
        //porque el hash set se identifica con un numero.

        ArrayList<Pais> auxPaises = new ArrayList<>(paises);
        Collections.sort(auxPaises, Pais.comparadorNombresPais);
        System.out.println("Lista de paises ordenados: ");
        for (Pais auxPaise : auxPaises)
        {
            System.out.println(auxPaise.toString());
        }
    }

    //Metodo que busca y elimina el pais.
    public void eliminarPais() {
        boolean estaPais = true;
        Iterator<Pais> it = paises.iterator();

        System.out.println("Ingrese el pais a buscar para eliminar: ");
        String buscarPais = leer.next();

        while (it.hasNext())
        {
            if (it.next().getNombrePais().equalsIgnoreCase(buscarPais))
            {
                it.remove();
                System.out.println("El pais se elimino correctamente de la lista.");
                estaPais = false;
                break;
            }
        }
        if (estaPais)
        {
            System.out.println("El pais no estaba en la lista.");
        }
    }

}
