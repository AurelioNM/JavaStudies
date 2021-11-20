package br.com.EstruturaDeDados.ClasseVetor;

import java.util.ArrayList;

public class ListaDeArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        System.out.println(existe);

        int pos = arrayList.indexOf("B");
        System.out.println(pos);

        System.out.println(arrayList.get(2));

        arrayList.remove("B");
        System.out.println(arrayList);

        System.out.println(arrayList.size());


    }
}
