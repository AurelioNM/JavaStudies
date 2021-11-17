package br.com.Produtividade;

import java.util.*;

public class CollectionsFactory {
    public static void main(String[] args) {

//        ----------ANTES
//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("primeiro");
//        nomes.add("segundo");
//        nomes.add("terceiro");
//        List<String> nomesImutavel = Collections.unmodifiableList(nomes);
//        System.out.println(nomesImutavel);

        List<String> nomes = List.of("primeiro, segundo, terceiro");
        Set.of("terceiroNome");
        Map.of("nome", "Joao");


        List<String> asList = Arrays.asList("nome1", "nome2");
        //asList.add("nome3"); java.lang.UnsupportedOperationException
        //asList.set(1, "nome3");
        System.out.println(asList);

        List<String> ofList = List.of("nome1", "nome2");
        //ofList.add("nome3"); java.lang.UnsupportedOperationException
        //ofList.set(3, "nome3"); java.lang.UnsupportedOperationException
        System.out.println(ofList);
    }
}
