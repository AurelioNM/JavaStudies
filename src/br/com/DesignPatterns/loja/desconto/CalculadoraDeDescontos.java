package br.com.DesignPatterns.loja.desconto;

import br.com.DesignPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDesconto = new DescontoParaOrcamentoMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDesconto.calcular(orcamento);
    }
}
