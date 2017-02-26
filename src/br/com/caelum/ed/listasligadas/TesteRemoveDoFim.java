package br.com.caelum.ed.listasligadas;

public class TesteRemoveDoFim {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("primeiroAdicionado");
		lista.adiciona("segundoAdicionado");
		lista.adiciona("terceiroAdicionado");
	
		
		lista.removeDoFim();
		
		System.out.println(lista);
		
		lista.removeDoFim();
		
		System.out.println(lista);
		
		lista.removeDoFim();
		
		System.out.println(lista);
		
//		saida esperada
//		[Rafael]
	}
}
