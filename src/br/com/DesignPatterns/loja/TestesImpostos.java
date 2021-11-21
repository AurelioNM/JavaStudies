package br.com.DesignPatterns.loja;

import br.com.DesignPatterns.loja.desconto.CalculadoraDeDescontos;
import br.com.DesignPatterns.loja.imposto.CalculadoraDeImpostos;
import br.com.DesignPatterns.loja.imposto.ICMS;
import br.com.DesignPatterns.loja.imposto.ISS;
import br.com.DesignPatterns.loja.imposto.Imposto;
import br.com.DesignPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));

    }
}
