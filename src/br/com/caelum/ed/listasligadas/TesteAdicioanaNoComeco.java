package br.com.caelum.ed.listasligadas;

public class TesteAdicioanaNoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("PrimeiroAdicionado");

		
		System.out.println(lista);
		
//		saida esperada
//		[Paulo, Rafael]
	}
}
