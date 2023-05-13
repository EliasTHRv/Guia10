package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author elias
 */
public class CorrecionDeErrores {

    public static void main(String[] args) {

//        Array<int> listado = new ArrayList;
// TreeSet<String> = TreeSet();
// HashMap<Integer> personas = new HashMap<>;
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> arborPersonas = new TreeSet();
        HashMap<Integer, String> personas = new HashMap<>();
        
        //
        
//        HashMap<Integer> personas = new HashMap<>;
//String n1 = “Albus”;
//String n2 = “Severus”;
//personas.add(n1);
//personas.add(n2);

HashMap<String, String> personas1 = new HashMap<>();
String n1 = "Albus";
String n2 = "Severus";
personas1.put(n1, n2);
        
    }

}
