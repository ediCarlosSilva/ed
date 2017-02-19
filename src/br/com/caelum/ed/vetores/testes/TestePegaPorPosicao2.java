package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.exercicios.Vetor;

public class TestePegaPorPosicao2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		
		lista.pega(0);
		
		lista.pega(1);
		
		lista.pega(100000000);
	}
	
}
