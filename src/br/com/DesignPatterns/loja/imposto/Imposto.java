package br.com.DesignPatterns.loja.imposto;

import br.com.DesignPatterns.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
