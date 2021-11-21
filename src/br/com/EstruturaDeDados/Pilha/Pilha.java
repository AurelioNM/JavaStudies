package br.com.EstruturaDeDados.Pilha;

import br.com.EstruturaDeDados.Base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return (T) this.elementos[tamanho-1];
    }

    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }
        return (T) this.elementos[--tamanho];
    }




    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 15; i++) {
            pilha.empilha(i);
        }
        pilha.desempilha();
        System.out.println(pilha.topo());
        System.out.println(pilha);
        
    }

}
