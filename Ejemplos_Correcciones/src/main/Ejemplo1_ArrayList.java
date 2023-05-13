package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Ejemplo1_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList();

        Integer y = 5;
        Integer x = 8;
        Integer c = 3;
        Integer b = 9;
        Integer n = 8;

        listaNumeros.add(y);
        listaNumeros.add(x);
        listaNumeros.add(c);
        listaNumeros.add(b);
        listaNumeros.add(n);

        System.out.println("El tamaño de la lista es: " + listaNumeros.size());

        listaNumeros.remove(3);

        System.out.println("El tamaño de la lista es: " + listaNumeros.size());

        listaNumeros.remove(0);

        System.out.println("El tamaño de la lista es: " + listaNumeros.size());

        System.out.println("----------");
//crea un array list de tipo Integer
        ArrayList<Integer> listaNumeros2 = new ArrayList();

        
        Integer z = 30;
        Integer h = 30;
        Integer o = 15;
        //cargamos los objetos al array list
        //el array list si admite objetos duplicados
        listaNumeros2.add(z);
        listaNumeros2.add(h);
        listaNumeros2.add(o);
        listaNumeros2.add(o);
        listaNumeros2.add(o);
        //remueve el primero de los objetos dentro del array list
        listaNumeros2.remove(o);
        
        
        System.out.println("Ingrese un numero a buscar");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int buscar = leer.nextInt();
        // Con este remove podemos ingresar el valor que deseemos buscar para eliminarlo de la lista.
        listaNumeros2.removeIf(numero -> numero == buscar);

        System.out.println("El tamaño de la lista es: " + listaNumeros2.size());


    }

}
