package br.com.caelum.ed.listasligadas;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("primeiroAdicionado");
		lista.adiciona("SegundoAdicionado");
		lista.adiciona("terceiroAdicionado");
		lista.adiciona("quartoAdicionado");
		
		System.out.println(lista);
	}
	
}
