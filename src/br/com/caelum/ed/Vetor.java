package br.com.caelum.ed;

public class Vetor {

	// Declarando e inicializando um array de Aluno com capacidade 100
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	
	public void adiciona( Aluno aluno ) {
//		for ( int i = 0; i < this.alunos.length; i++ ) {
//			if (this.alunos[i] == null ) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
		
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	
	
	public void adiciona ( int posicao, Aluno aluno ) {
		// 
	}
	
	public Aluno pega(int posicao ) {
		// implementação
		return null;
	}
	
	public void remove (int posicao) {
		// implementação
	}
	
	public boolean contem (Aluno aluno) {
		for ( int i = 0; i < this.totalDeAlunos; i++) {
//			if (aluno == this.alunos[i]) {
//				return true;
//			}
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
			
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	public String toString() {
//		return Arrays.toString(alunos);
		
		if (this.totalDeAlunos == 0 ) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for ( int i = 0; i < this.totalDeAlunos - 1; i++ ) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
	
		return builder.toString();
	}
	
}
