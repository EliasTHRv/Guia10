package entidad;

//import java.util.Comparator;

import java.util.Comparator;


/**
 *
 * @author elias
 */
public class Pais {
    
    private String nombrePais;

    public Pais() {
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return   nombrePais;
    }
    
    public static Comparator<Pais> comparadorNombresPais = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
          return o1.getNombrePais().compareTo(o2.getNombrePais());
        }
    };
    
//    public static Comparator<Pais> comparadorPaises = new Comparator<Pais>() {
//        @Override
//        public int compare(Pais o1, Pais o2) {
//      return o1.getNombrePais().compareTo(o2.getNombrePais());
//        }
//    };
//    
}
