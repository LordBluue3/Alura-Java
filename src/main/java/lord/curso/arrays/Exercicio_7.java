package lord.curso.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio_7 {

    public static void main (String []args){

        String aulaJava = "Aula Java";
        String aulaKotlin = "Aula Kotlin";
        String aulaMysql = "Aula Mysql";
        String aulaLua = "Aula Lua";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aulaJava);
        aulas.add(aulaKotlin);
        aulas.add(aulaMysql);
        aulas.add(aulaLua);

        System.out.println(aulas);
        aulas.remove(1);
        System.out.println(aulas);

        System.out.println(aulas.get(0));

        Collections.sort(aulas);
        System.out.println(aulas);
    }

}
