package Questao7;

public class Carro extends Veiculo{

    private String modelo;

    public Carro(String cor, String modelo){
        //Como a classe Veiculo não tem um construtor sem parâmetros, o uso do super é necessário.
        super(cor);
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
}