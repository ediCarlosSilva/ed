package br.com.caelum.ed.listasligadas;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("primeiroAdicionado");
		lista.adiciona(0, "SegundoadicionaPosicaoZero");
		lista.adiciona(1, "TerceiroadicionaNaPosicaoUm");
		lista.adiciona("quartoAdicionado");
		
		System.out.println(lista);
		// saida esperada
		// [Paulo, Camila, Rafael]
	}
	
}
