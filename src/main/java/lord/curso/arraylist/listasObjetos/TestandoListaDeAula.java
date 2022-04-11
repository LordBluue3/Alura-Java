package lord.curso.arraylist.listasObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {
    public static void main(String[] args) {

        Aula aula = new Aula("Revisando Arrays", 21);
        Aula aula2 = new Aula("Aula de Java", 25);
        Aula aula3 = new Aula("Aula de Kotlin", 30);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("Desordenado: "+aulas);
        Collections.sort(aulas);
        System.out.println("Ordem alfabética: "+aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println("Por tempo: "+aulas);
    }
}
