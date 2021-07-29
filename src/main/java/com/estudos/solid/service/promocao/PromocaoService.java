package com.estudos.solid.service.promocao;

import com.estudos.solid.exception.ValidacaoException;
import com.estudos.solid.model.Cargo;
import com.estudos.solid.model.Funcionario;


public class PromocaoService {
	
	public void promover(final Funcionario funcionario, final boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes nao podem ser promovidos!");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario nao bateu a meta!");
		}
	}

}
