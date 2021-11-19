package br.com.EstruturaDeDados.ClasseVetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public boolean adiciona(String elemento) {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

    }


    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Alou");
        vetor.adiciona("Alou2");
        System.out.println(vetor.tamanho());


    }

}
