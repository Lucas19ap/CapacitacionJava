       /* Crear un proyecto básico en Java con método Main
        * Invocar un método que imprima un listado de nombres (Lista de String)
        * Invocar un método que dada una lista de String y un String como parámetro, retorne si la lista contiene el String
        (si al menos un elemento es igual)
        * Invocar un método que dada una lista de String y un String como parámetro, retorne una nueva lista con los elementos de la misma
        que contienen ese String (ejemplo el String "Juan Melo" contiene al String "Melo");
        * invocar un método que genere un Map (clave Long y valor String).
        Luego invocar a un método que dado este Map retorne si una clave existe o no
        Luego otro método que dado ese mismo map retorne el valor de una clave. */

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

        String alumnoBuscado = "Nico E";
        imprimirAlumnos(alumnos);
        buscarAlumno(alumnos, alumnoBuscado);

        Map<Long,String> alumnosMap = new HashMap<Long, String>();
        alumnosMap.put(35051437L, "Lucas");
        alumnosMap.put(35065548L, "Nico");
        alumnosMap.put(25668971L, "Paula");
        alumnosMap.put(24658971L, "Anibal");
        buscarAlumnoList(alumnos);
        buscarAlumnoMap(alumnosMap, 35051437L);

    }

    private static void buscarAlumnoList(List<String> alumnos) {
        for (String alumno : alumnos ) {
            if (alumno.contains("A")) {
                System.out.println("Alumno lista: " + alumno);
            }
        }
    }

    private static void buscarAlumnoMap(Map<Long, String> mapa, Long idBuscado) {
        System.out.println("Alumno en el Mapa: " + mapa.get(idBuscado));
    }


    private static void buscarAlumno(List<String> alumnos, String alumnoBuscado) {
        boolean encontrado = false;

        for (String alumno : alumnos) {
            if (alumno.equals(alumnoBuscado)) {
                encontrado = true;
                break;
            }

        }

        int i = 0;
        while (alumnos.get(i) == alumnoBuscado && i < alumnos.size())
        {
            i++;
            encontrado = true;
        }

        if (encontrado) {
            System.out.println("Se encontro el alumno: " + alumnoBuscado);
        } else {
            System.out.println("No se encontro el alumno: " + alumnoBuscado);
        }
    }


    private static void imprimirAlumnos(List<String> alumnos) {
        for (String alumno : alumnos) {
            System.out.println("Alumno: " + alumno);
        }
    }
}
