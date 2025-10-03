package Questao3;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private double preco;
    private String nivel;

    public Curso(String nome, int caraHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = caraHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public double calcularDesconto(){
        return preco * 0.10;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Preço: " + preco + "R$");
        System.out.println("Nivel: " + nivel);
        System.out.println("Desconto: " + calcularDesconto() + "R$");
    }

    public String getNome() {
        return nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public double getPreco() {
        return preco;
    }
    public String getNivel() {
        return nivel;
    }

}
