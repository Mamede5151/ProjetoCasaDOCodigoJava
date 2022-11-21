package Casa;

public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	String nomeDoAutor;
	String emailDoAutor;
	String cpfDoAutor;
	Autor autor;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome" + nome);
		System.out.println("Descricao" + descricao);
		System.out.println("Valor" + valor);
		System.out.println("ISBN" + isbn);
		System.out.println("--");
	}
	

}
