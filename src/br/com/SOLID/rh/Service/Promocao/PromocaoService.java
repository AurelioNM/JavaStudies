package br.com.SOLID.rh.Service.Promocao;

import br.com.SOLID.rh.Model.Cargo;
import br.com.SOLID.rh.Model.Funcionario;
import br.com.SOLID.rh.ValidacaoException;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos");
        }
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario nao bateu a meta");
        }
    }

}
