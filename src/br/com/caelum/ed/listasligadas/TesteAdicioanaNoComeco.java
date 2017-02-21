package br.com.caelum.ed.listasligadas;

public class TesteAdicioanaNoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		
		System.out.println(lista);
		
//		saida esperada
//		[Paulo, Rafael]
	}
}
