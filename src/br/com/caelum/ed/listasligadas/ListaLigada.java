package br.com.caelum.ed.listasligadas;

public class ListaLigada {
	
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não exite");
		}
		
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}
	
	// adiciona no fim
	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	// adiciona em qualquer posição
	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) { // No começo.
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) { // No Fim
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
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
		
		// Verificando se a lista está vazia
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo até o penúltimo elemento
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		// último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
}
