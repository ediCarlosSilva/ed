package br.com.caelum.ed.listasligadas;

public class ListaLigada {
	
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		
	}
	
	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object o) {
		return false;
	}
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;
	}
	
	public void removeDoComeco() {
		
	}
	
	public void removeDoFim() {
		
	}
	
	public String toString() {
		
		// Verificando se a lista est� vazia
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo at� o pen�ltimo elemento
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		// �ltimo elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
}
