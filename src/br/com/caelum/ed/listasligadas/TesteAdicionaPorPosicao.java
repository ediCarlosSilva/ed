package br.com.caelum.ed.listasligadas;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("primeiroAdicionado");
		lista.adiciona("SegundoAdicionado");
		lista.adiciona(1, "TerceiroAdicionado");
		
				
		System.out.println(lista);
		// saida esperada
		// [Paulo, Camila, Rafael]
	}
	
}
