package br.com.EstruturaDeDados.Fila;

import br.com.EstruturaDeDados.Base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica {

    public Fila(){
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void emfileira(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar(){
        if (this.estaVazia()) {
            return null;
        }
        return (T) this.elementos[0];
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }
       T elementoRemovido = (T) this.elementos[0];
       remove(0);
       return elementoRemovido;
    }

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());
        fila.emfileira(7);
        fila.emfileira(6);
        fila.emfileira(2);
        System.out.println(fila);
        fila.remove(1);
        System.out.println(fila.espiar());
        System.out.println(fila);

    }
}
