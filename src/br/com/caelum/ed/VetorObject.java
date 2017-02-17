package br.com.caelum.ed;

public class VetorObject {

	// Declarando e inicializando um array de Aluno com capacidade 100
		private Object[] objetos = new Object[100];
		private int totalDeObjetos = 0;
		
		public void adiciona( Object objeto ) {
//			for ( int i = 0; i < this.alunos.length; i++ ) {
//				if (this.alunos[i] == null ) {
//					this.alunos[i] = aluno;
//					break;
//				}
//			}
			
			this.garantaEspaco();
			this.objetos[this.totalDeObjetos] = objeto;
			this.totalDeObjetos++;
		}
		
		public void adiciona ( int posicao, Object objeto ) {
			this.garantaEspaco();
			 if (!this.posicaoValida(posicao)) {
				 throw new IllegalArgumentException("Posição inválida");
			 }
			 
			 for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
				 this.objetos[i + 1] = this.objetos[i];
			 }
			 
			 this.objetos[posicao] = objeto;
			 this.totalDeObjetos++;
		}

		public Object pega(int posicao ) {
			
			if ( !this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posição Inválida");
			}
			
			return this.objetos[posicao];
		}

		public void remove (int posicao) {
			if (!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posição inválida");
			}
			for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
				this.objetos[i] = this.objetos[i + 1];
			}
			this.totalDeObjetos--;		
		}

		public boolean contem (Object objeto) {
			for ( int i = 0; i < this.totalDeObjetos; i++) {
//				if (aluno == this.alunos[i]) {
//					return true;
//				}
				if (objeto.equals(this.objetos[i])) {
					return true;
				}
				
			}
			return false;
		}
		
		public int tamanho() {
			return this.totalDeObjetos;
		}

		private boolean posicaoOcupada(int posicao) {
			return posicao >= 0 && posicao < this.objetos.length;
		}
		
		private boolean posicaoValida(int posicao) {
			return posicao >= 0 && posicao <= this.totalDeObjetos;
		}
		
		private void garantaEspaco() {
			if (this.totalDeObjetos == this.objetos.length) {
				Object[] novaArray = new Object[this.objetos.length * 2];
				for ( int i = 0; i < this.objetos.length; i++) {
					novaArray[i] = this.objetos[i];
				}
				this.objetos = novaArray;
			}
		}
		
		public String toString() {
//			return Arrays.toString(alunos);
			
			if (this.totalDeObjetos == 0 ) {
				return "[]";
			}
			
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			
			for ( int i = 0; i < this.totalDeObjetos - 1; i++ ) {
				builder.append(this.objetos[i]);
				builder.append(", ");
			}
			
			builder.append(this.objetos[this.totalDeObjetos - 1]);
			builder.append("]");
		
			return builder.toString();
		}
		
}
