package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * @author elias
 */
public class alumnoServicio {

    private ArrayList<Alumno> clase;
    private Scanner leer;
    private Alumno alum;

    public alumnoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.clase = new ArrayList<>();
        this.alum = new Alumno();
    }

    public void crearClase() {
        String confirmacion = "";
        String nombreAlumno = "";
        System.out.println("Ingrese la cantidad de notas de los alumnos: ");
        int cantNotas = leer.nextInt();

        do
        {
            Alumno alum1 = new Alumno();
            System.out.println("Ingrese el nombre: ");
            nombreAlumno = leer.next();
//            alum.setNombre(leer.next());
            System.out.println("Ingrese las notas del alumno: ");
            ArrayList<Integer> notasAlumnos = new ArrayList<>();
            for (int i = 0; i < cantNotas; i++)
            {
                notasAlumnos.add(leer.nextInt());
            }
//            alum.setNotas(notasAlumnos);
//            clase.add(alum);
            clase.add(new Alumno(nombreAlumno, notasAlumnos));
            System.out.println("Desea cargar otro alumno;  S/N");
            confirmacion = leer.next();

        } while (confirmacion.equalsIgnoreCase("s"));

        System.out.println(clase.toString());
    }

//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    public void notaFinal() {
        System.out.println("Ingrese el nombre de un alumno para calcular su nota final: ");
        String alumnoAcalcular = leer.next();
        double sumaNotas = 0;
        boolean estaAlumno = false;
        Iterator<Alumno> it = clase.iterator();
        double promedioAlumno = 0;
        while (it.hasNext())
        {
//            if (it.next().getNombre().equalsIgnoreCase(alumnoAcalcular))
//            {
//                for (Integer nota : it.next().getNotas())
//                {
//                    sumaNotas += nota;
//                    estaAlumno = true;
//                }
//            }
            Alumno auxAlumno = it.next();
            if (auxAlumno.getNombre().equalsIgnoreCase(alumnoAcalcular))
            {
                for (Integer nota : auxAlumno.getNotas())
                {
                    sumaNotas += nota;
                    estaAlumno = true;
                }
            }

            if (estaAlumno)
            {
//                                promedioAlumno = sumaNotas / it.next().getNotas().size();
                promedioAlumno = sumaNotas / auxAlumno.getNotas().size();
                System.out.println("El promedio del alumno " + alumnoAcalcular + " es: " + promedioAlumno);

            } else
            {
                System.out.println("El alumno no existe en la clase: :c ");
            }

        }

    }

}
