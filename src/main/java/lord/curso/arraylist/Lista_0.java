package lord.curso.arraylist;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class Lista_0 {
    public static void main(String[] args) {
        String aula = "Conhecendo mais as listas";
        String aula2 = "Modelando a classe Listas_0";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        //adicionando itens na lista
        aulas.add(aula);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        //Maneiras de Percorrer uma lista
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Primeira maneira de percorrer uma lista ForEach");
        for (String aulao: aulas) {
            System.out.println("Aula: "+ aulao);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Segunda maneira de percorrer uma lista For");
        for(int j = 0; j < aulas.size(); j++){
            System.out.println("Aula: "+j+" - "+aulas.get(j));
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Terceira maneira de percorrer uma lista método ForEach com expressão lambda");

        aulas.forEach(aulaaa -> {
            System.out.println("Aula: " + aulaaa);
        });
        aulas.add("Avião");
        System.out.println("-----------------");
        System.out.println(aulas);
        System.out.println("-------------------");
        System.out.println("peripercia: ");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
