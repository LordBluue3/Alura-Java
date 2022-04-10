package lord.curso.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio_5 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Mikael");
        nomes.add("Lord");
        nomes.add("Robertinho");

        System.out.println(nomes.size());
        boolean removido = nomes.remove("Robertinho");
        System.out.println(removido);
        System.out.println(nomes.size());

        ArrayList<String> nomesDois = new ArrayList<>();

        nomesDois.add("Macaquinho");
        nomesDois.add("Banana");
        nomesDois.add("Macaquinho");

        ArrayList<String> tudo = new ArrayList<>();

        tudo.addAll(nomes);
        tudo.addAll(nomesDois);

        System.out.println(tudo);
        System.out.println(nomes.get(0)+" "+nomesDois.get(0));
        System.out.println("==========================================");

        Iterator<String> it = tudo.iterator();

        try {
            while (it.hasNext()) {
                String atual = it.next();
                it.remove();
                System.out.println(atual);
            }
        }catch (Exception e){
            System.out.println("deu pepino");
        }
        System.out.println(tudo.size());
    }
}
