package br.com.operador;

import java.math.BigDecimal;

public class Soma extends IOperador {

	@Override
	public BigDecimal execute(BigDecimal esquerda, BigDecimal direita) {
		return esquerda.add(direita);
	}

	@Override
	public Integer getPrioridade() {
		return 0;
	}

}
