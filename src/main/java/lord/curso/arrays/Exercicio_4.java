package lord.curso.arrays;

import java.util.ArrayList;

public class Exercicio_4 {
    public static void main(String[] args){

        ArrayList<Double> salvar = new ArrayList<>();

        for(double i = 0; i < 900; i++ ){
            i = Math.random();
            salvar.add(i);
            System.out.println(salvar);
        }
    }
}
