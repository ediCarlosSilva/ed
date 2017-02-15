package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

	// Declarando e inicializando um array de Aluno com capacidade 100
	private Aluno[] alunos = new Aluno[100];
	
	public void adiciona( Aluno aluno ) {
		for ( int i = 0; i < this.alunos.length; i++ ) {
			if (this.alunos[i] == null ) {
				this.alunos[i] = aluno;
				break;
			}
		}
	}
	
	
	
	public void adiciona ( int posicao, Aluno aluno ) {
		// implementação
	}
	
	public Aluno pega(int posicao ) {
		// implementação
		return null;
	}
	
	public void remove (int posicao) {
		// implementação
	}
	
	public boolean contem (Aluno aluno) {
		// implementação
		return true;
	}
	
	public int tamanho() {
		// implementação
		return 0;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
	
}
