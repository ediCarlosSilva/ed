package br.com.caelum.ed.vetores.exercicios;

import br.com.caelum.ed.vetores.Aluno;

public class Vetor {

	// Declarando e Inicializando um array de Aluno com capacidade 100000
	private Aluno[] alunos = new Aluno[100000];
	private int totalDeAlunos = 0;
	
	public void adiciona (Aluno aluno) {
		// primeira maneira consumo de tempo linear
//		for (int i = 0; i < this.alunos.length; i++) {
//			if (this.alunos[i] == null) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
		
		// segunda maneira. consumo de tempo constante
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		//implementa��o
	}
	
	public Aluno pega(int posicao) {
		// implementa��o
		return null;
	}
	
	public void remove (int posicao) {
		// implementa��o
	}
	
	public boolean contem ( Aluno aluno ) {
		// implementa��o
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeAlunos - 1;i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
}
