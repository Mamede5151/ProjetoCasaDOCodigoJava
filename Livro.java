package Casa;

public class Livro {
	String nome;
	String descricao;
	private double valor;
	String isbn;
	String nomeDoAutor;
	String emailDoAutor;
	String cpfDoAutor;
	Autor autor;
	boolean temAutor() {
		return this.autor != null;
	}
	
	void adicionarValor(double valor) {
		this.valor = valor;
	}
	double retornaValor() {
		return this.valor;
		//System.out.println("valor atual" + livro.retornaValor);

		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNomeDoAutor() {
		return nomeDoAutor;
	}

	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}

	public String getEmailDoAutor() {
		return emailDoAutor;
	}

	public void setEmailDoAutor(String emailDoAutor) {
		this.emailDoAutor = emailDoAutor;
	}

	public String getCpfDoAutor() {
		return cpfDoAutor;
	}

	public void setCpfDoAutor(String cpfDoAutor) {
		this.cpfDoAutor = cpfDoAutor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome" + nome);
		System.out.println("Descricao" + descricao);
		System.out.println("Valor" + valor);
		System.out.println("ISBN" + isbn);
		autor.mostrarDetalhes();
		System.out.println("--");
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
		
	}
	
	public boolean aplicarDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * porcentagem;
			return true;
	}

}
