package lord.curso.arrays;

import java.util.ArrayList;

public class Exercicio_6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");list.add("b");
        list.add("a");list.add("c");
        list.add("a");list.add("b");
        list.add("a");
        System.out.println(list);
        System.out.println(list.indexOf("b"));

    }
}
