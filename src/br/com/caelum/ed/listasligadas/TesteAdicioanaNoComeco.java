package br.com.caelum.ed.listasligadas;

public class TesteAdicioanaNoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("PrimeiroAdicionado");
		lista.adicionaNoComeco("SegundoAdicionado");
		lista.adicionaNoComeco("TerceiroAdicionado");
		lista.adicionaNoComeco("quardoAdicionado");
		
		System.out.println(lista);
		
//		saida esperada
//		[Paulo, Rafael]
	}
}
