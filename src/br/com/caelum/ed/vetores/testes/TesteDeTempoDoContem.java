package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.exercicios.Vetor;

public class TesteDeTempoDoContem {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		
		// adicionando 100000 alunos e
		// verificando se eles foram adicionados
		for (int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
			if(!vetor.contem(aluno)) {
				System.out.println("Erro: aluno "
						+ aluno + " n�o foi localizado.");
			}
		}
		
		// verificando se o Vetor n�o encontra alunos n�o adicionados.
		for (int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			if (vetor.contem(aluno))  {
				System.out.println("Erro: aluno "
						+ aluno + " foi adicionado.");
			}
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo = " + tempo);
	}
}
