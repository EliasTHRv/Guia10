package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas.
 *
 * @author elias
 */
public class tiendaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Integer> listaTienda;

    public tiendaServicio() {
        this.listaTienda = new HashMap<>();
    }

    public void menuTienda() {
        int opcion;
        String confirmacionSalida = "";
        do
        {
            System.out.println(" --------- ");

            System.out.println("Ingrese la operacion que desea realizar:");
            System.out.println("Previamente cargame los datos pa' ");

            System.out.println(" --------- ");

            System.out.println("1:" + "Cargar un producto.");
            System.out.println("2:" + "Modificicar precio de un producto.");
            System.out.println("3:" + "Eliminar un producto.");
            System.out.println("4:" + "Mostrar todos los  productos.");
            System.out.println("5:" + "Salir");

            System.out.println(" --------- ");
            opcion = leer.nextInt();

            switch (opcion)
            {
                case 1:
                    cargarTienda();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 5:
                    System.out.println("Confirma para salir? S");
                    confirmacionSalida = leer.next();
                    break;
                default:
                    System.out.println("NO ES UNA OPCION CORRECTA!!!!");
            }
        } while (!confirmacionSalida.equalsIgnoreCase("s"));
        System.out.println(" ");

    }

    private void cargarTienda() {
        String nombreProducto = "";
        Integer precioProducto = 0;
        String confirmacio = "";
        do
        {
            System.out.println("Ingrese el nombre del producto: ");
            nombreProducto = leer.next();
            System.out.println("Ingrese el valor del producto: ");
            precioProducto = leer.nextInt();

            listaTienda.put(nombreProducto, precioProducto);

            System.out.println("Quiere cargar otro producto a la lista? S/N");
            confirmacio = leer.next();
        } while (confirmacio.equalsIgnoreCase("s"));
    }

    private void modificarPrecio() {
        System.out.println("Ingrese el producto que quiere modificar el precio:");
        String productoBuscar = leer.next();
        int precioModificado;
        for (Map.Entry<String, Integer> entry : listaTienda.entrySet())
        {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (key.equalsIgnoreCase(productoBuscar))
            {
                System.out.println("Ingrese el valor modificado: ");
                precioModificado = leer.nextInt();
                listaTienda.replace(key, value, precioModificado);
                System.out.println("Se modifico correctamente su precio.");
                break;
            }
        }

    }

    // eliminar un producto
    private void eliminarProducto() {
        System.out.println("Ingrese el producto que quiere buscar:");
        String productoBuscar = leer.next();
        for (Map.Entry<String, Integer> entry : listaTienda.entrySet())
        {

            String key = entry.getKey();

            if (key.equalsIgnoreCase(productoBuscar))
            {
                System.out.println("Ingrese el valor modificado: ");
                listaTienda.remove(key);

                System.out.println("Se elimino correctamente..");
                break;
            }
        }
    }

    private void mostrarLista() {
        for (Map.Entry<String, Integer> entry : listaTienda.entrySet())
        {

            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("El producto " + key + " \n " + "Y su precio es: $ " + value);
        }

    }
}
