package br.com.rhinosistemas.operacoes;

import br.com.rhinosistemas.tipooperacao.TipoOperacao;

public class Calculadora {

	public Double executarOperacao(TipoOperacao p_tipoOperacao, Double p_primeroNumero, Double p_segundoNumero) {
		
		Double resultado = 0D;
		
		if (p_tipoOperacao.equals(TipoOperacao.SOMAR)) {
			resultado = p_primeroNumero + p_segundoNumero;
		} else if (p_tipoOperacao.equals(TipoOperacao.SUBTRAIR)) {
			resultado = p_primeroNumero - p_segundoNumero;
		} else if (p_tipoOperacao.equals(TipoOperacao.MULTIPLICAR)) {
			resultado = p_primeroNumero * p_segundoNumero;
		} else if (p_tipoOperacao.equals(TipoOperacao.DIVIDIR)) {
			resultado = p_primeroNumero / p_segundoNumero;
		} else if (p_tipoOperacao.equals(TipoOperacao.DIVIDIR)) {
			
			// Regra de porcentagem nos numeros
			
		}
		
		return resultado;
		
	}


}
