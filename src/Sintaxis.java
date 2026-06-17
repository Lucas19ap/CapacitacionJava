       /* Crear un proyecto básico en Java con método Main*/

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Sintaxis {


    public static void main (String[] args){

        List<String> alumnos = new ArrayList<String>();

        alumnos.add("Lucas A");
        alumnos.add("Nico E");
        alumnos.add("Paula A");
        alumnos.add("Anibal A");
        alumnos.add("Lucas S");


        imprimirAlumnos(alumnos);

        String alumnoBuscado = "MariaMaria";
        if (buscarAlumno(alumnos,alumnoBuscado)){
            System.out.println("Se encontro el alumno: " + alumnoBuscado);
        }else{
            System.out.println("No se encontro el alumno: " + alumnoBuscado);
        }

        System.out.println( buscarAlumnoList(alumnos,"a"));

        Map<Long,String> alumnosMap = new HashMap<Long, String>();
        alumnosMap.put(35051437L, "Lucas");
        alumnosMap.put(35065548L, "Nico");
        alumnosMap.put(25668971L, "Paula");
        alumnosMap.put(24658971L, "Anibal");
        Long dni = 25668971L;
        if (buscarAlumnoMap(alumnosMap,dni)){
            System.out.println("Se encontro el DNI: " + dni);
        }else{
            System.out.println("No se encontro el DNI: " + dni);
        }
    }

     /* Invocar un método que imprima un listado de nombres (Lista de String)*/
    private static void imprimirAlumnos(List<String> alumnos) {
        for (String alumno : alumnos) {
            System.out.println("Alumno: " + alumno);
        }
    }



    /* Invocar un método que dada una lista de String y un String como parámetro, retorne si la lista contiene el String
            (si al menos un elemento es igual)*/

    /*
    private static String buscarAlumno(List<String> alumnos, String alumnoBuscado) {

        for (String alumno : alumnos) {
            if (alumno.equals(alumnoBuscado)) {
                return "Se encontro el alumno: " + alumnoBuscado;
            }
        }
        return "No se encontro el alumno: " + alumnoBuscado;
    }
       */
    private static boolean buscarAlumno(List<String> alumnos, String alumnoBuscado) {


        return alumnos.contains(alumnoBuscado);
    }

/* Invocar un método que dada una lista de String y un String como parámetro, retorne una nueva lista con los elementos de la misma
    que contienen ese String (ejemplo el String "Juan Melo" contiene al String "Melo");*/

    private static List<String> buscarAlumnoList(List<String> alumnos, String item) {
        List<String>listaDevuelta = new ArrayList<>();
        for (String alumno : alumnos ) {
            if (alumno.contains(item)) {
                listaDevuelta.add(alumno);
            }
        }
    return listaDevuelta;
    }

/* invocar un método que genere un Map (clave Long y valor String).
    Luego invocar a un método que dado este Map retorne si una clave existe o no
    Luego otro método que dado ese mismo map retorne el valor de una clave. */

    private static boolean buscarAlumnoMap(Map<Long, String> mapa, Long dniBuscado) {
        return mapa.containsKey(dniBuscado);

    }
}

