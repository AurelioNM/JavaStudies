package br.com.SOLID.rh.Service;

import br.com.SOLID.rh.Model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
