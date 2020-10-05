package parcial1.R20201Q.Redone_ej1;

import java.util.Arrays;
import java.util.Comparator;

public class MovieTester {

    public static void main(String[] args) {
        // Película: Nombre, año de lanzamiento y user rating
        Movie bttf1 = new Movie("Back to the Future", 1985, 8.5);
        Movie bttf2 = new Movie("Back to the Future Part II", 1989, 7.8);
        Movie bttf3 = new Movie("Back to the Future Part III", 1990, 7.8);

        Movie[] bttfTrilogy = new Movie[]{bttf3, bttf1, bttf2};

        // Orden 1: Orden de inserción al crear el array bttfTrilogy
        System.out.println(Arrays.toString(bttfTrilogy));
        // Imprime [Back to the Future Part III, Back to the Future, Back to the Future Part II]

        // Orden 2: Orden descendente por rating
        // y luego desempata alfabéticamente por nombre
        Arrays.sort(bttfTrilogy);
        System.out.println(Arrays.toString(bttfTrilogy));
        // Imprime [Back to the Future, Back to the Future Part II, Back to the Future Part III]

        // COPIAR EN LA RESPUESTA TODAS LAS LÍNEAS QUE NO SEAN COMENTARIOS A PARTIR DE ESTA LINEA

        // Orden 3: Orden descendente por año de lanzamiento
        // y luego desempata alfabéticamente por nombre
        Arrays.sort(bttfTrilogy, new Comparator<>(){
            @Override
            public int compare(Movie o1, Movie o2){
                int cmp = Integer.compare(o2.getYear(), o1.getYear());
                if(cmp == 0)
                    cmp = o2.getName().compareTo(o2.getName());
                return cmp;
            }
        });
        System.out.println(Arrays.toString(bttfTrilogy));
        // Imprime [Back to the Future Part III, Back to the Future Part II, Back to the Future]
    }
}