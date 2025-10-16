package Questao2;

public class Desenvolvedor extends Funcionario {
    private double salarioBase;

    public Desenvolvedor(String nome, int codigoCargo, double salarioBase){
        super(nome, codigoCargo);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularBonificacao(){
        switch (codigoCargo) {
            case 1:
                return salarioBase * 0.10;
            case 2:
                return salarioBase * 0.15;
            case 3:
                return salarioBase * 0.20;
            default:
                return salarioBase * 0.05;
        }
    }
}
