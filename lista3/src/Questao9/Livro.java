package Questao9;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public double calcularMultaAtraso() {
        return 2.0;
    }

    public void exibirFichaCatalografica() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Multa por atraso: R$ " + calcularMultaAtraso() + " por dia");
    }
}
