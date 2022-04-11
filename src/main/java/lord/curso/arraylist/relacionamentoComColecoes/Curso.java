package lord.curso.arraylist.relacionamentoComColecoes;

import lord.curso.arraylist.listasObjetos.Aula;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor, List<Aula> aulas) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }
}
