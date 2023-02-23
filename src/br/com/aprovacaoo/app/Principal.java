package br.com.aprovacaoo.app;
import javax.swing.JOptionPane;

import br.com.aprovacao.bo.CalculodeNotasBo;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3,media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

		CalculodeNotasBo med = new CalculodeNotasBo();
		
		media = med.media(nota1, nota2, nota3);
		
		if (media >= 7.0) {
	        JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado(a) com média " + media);
	    } else {
	        JOptionPane.showMessageDialog(null, "Infelizmente, você foi reprovado(a) com média " + media);
	    }
		
		}
}