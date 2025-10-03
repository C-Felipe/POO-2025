package Questao2;

public class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (saldo > 0){
            saldo = saldo + valor;
        }
    }

    public boolean sacar(double valor){
        if ( valor > 0 && saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public double consultarSaldo(){
        return saldo;
    }



}
