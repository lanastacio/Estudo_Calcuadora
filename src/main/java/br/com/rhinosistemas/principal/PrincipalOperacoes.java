package br.com.rhinosistemas.principal;

import javax.swing.JOptionPane;

import br.com.rhinosistemas.operacoes.Calculadora;
import br.com.rhinosistemas.tipooperacao.TipoOperacao;

public class PrincipalOperacoes {
	
	public static void main(String[] args) {
		
		
		String[] values = {"+", "-", "*", "/"};
		TipoOperacao operacao = null;

		Object operacaoDialogo = JOptionPane.showInputDialog(null, "Selecione a operação desejada", "Selecione", JOptionPane.DEFAULT_OPTION, null, values, "+");
		if ( operacaoDialogo != null ){
		    String operacaoSelecionada = operacaoDialogo.toString();
		    
		    if (operacaoSelecionada.equalsIgnoreCase("+")) {
		    	operacao = TipoOperacao.SOMAR;
		    } else if (operacaoSelecionada.equalsIgnoreCase("-")) {
		    	operacao = TipoOperacao.SUBTRAIR;
		    } else if (operacaoSelecionada.equalsIgnoreCase("*")) {
		    	operacao = TipoOperacao.MULTIPLICAR;
		    } else if (operacaoSelecionada.equalsIgnoreCase("/")) {
		    	operacao = TipoOperacao.DIVIDIR;
		    }
		}else{
		    System.out.println("User cancelled");
		}
		
		String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero");
		String segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero");
		
		if (operacao == null ||  primeiroNumero.isBlank() || segundoNumero.isBlank()) {
			JOptionPane.showMessageDialog(null, "Por favor, selecione uma operação e digite os respectivos valores.");
			return;
		}
		
		
		Calculadora calcular = new Calculadora();
		
		try {
			
			Double resultado = calcular.executarOperacao(operacao, Double.valueOf(primeiroNumero), Double.valueOf(segundoNumero));
			
			JOptionPane.showMessageDialog(null, "O resultado da operação " + operacao.toString() + " é : " + resultado);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Os valores informados gerou um erro, verifique se digitou somente numeros " + e.getMessage());
		}
		
	}
	
}
