package br.com.GerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TesteAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");

        System.out.println(pauloEstaMatriculado);

        List<String> alunosEmLista = new ArrayList<>(alunos);

//        alunos.forEach(i -> {
//            System.out.println(i);
//        });

//        System.out.println(alunos);

    }
}
