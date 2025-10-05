package Questao6;

public class Filme extends Midia{
    private String diretor;
    private String genero;

    public Filme(String titulo, int anoLancamento, int duracao, double preco, String diretor, String genero){
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoAluguel(){
        return 0.15 * preco;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Diretor: " + diretor);
        System.out.println("Genero: " + genero);
    }
}
