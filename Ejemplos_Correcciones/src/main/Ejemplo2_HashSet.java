package main;

import java.util.HashSet;

/**
 *
 * @author elias
 */
public class Ejemplo2_HashSet {

    public static void main(String[] args) {

        HashSet<Integer> numeritos = new HashSet<>();
        Integer n1 = 30;
        Integer n2 = 12;
        Integer n3 = 2;

        numeritos.add(n1);
        numeritos.add(n2);
        
        //n2 no lo añadiria de nuevo ya que no admite duplicados
        numeritos.add(n2);
        numeritos.add(n3);

        for (Integer numerito : numeritos)
        {
            System.out.println(numeritos);
        }

        System.out.println(numeritos.size());

        numeritos.remove(2);


        for (Integer numerito : numeritos)
        {
            System.out.println(numeritos);
        }
    }

}
