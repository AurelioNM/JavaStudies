package br.com.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();

//        cursos.stream().filter(c -> c.getAlunos() >= 100)
//                .findAny()
//                .ifPresent(c -> System.out.println(c.getNome()));

        //dado o curso, qual vai ser a chave e valor
        cursos.stream().filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()
                ))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));





//        cursos.forEach(c -> System.out.println(c.getNome()));



    }
}