package com.estudos.solid.service.reajuste;

import com.estudos.solid.model.Funcionario;

import java.math.BigDecimal;



public interface ValidacaoReajuste {
	
	void validar(final Funcionario funcionario, final BigDecimal aumento);

}
