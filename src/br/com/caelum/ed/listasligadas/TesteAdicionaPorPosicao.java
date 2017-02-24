package br.com.caelum.ed.listasligadas;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("primeiroAdicionado");
		lista.adiciona("SegundoAdicionado");
		lista.adiciona("TerceiroAdicionado");
		lista.adiciona("quartoAdicionado");
		lista.adiciona(3, "quintoAdicionado");
		
		System.out.println(lista);
		// saida esperada
		// [Paulo, Camila, Rafael]
	}
	
}
