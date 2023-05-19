package main;

import servico.paisServicio;

/**
 *
 * @author elias
 */
public class mainPais {

    public static void main(String[] args) {
        paisServicio ps1 = new paisServicio();

        ps1.cargarPaises();
        ps1.ordenarPaises();
        ps1.eliminarPais();
    }

}
