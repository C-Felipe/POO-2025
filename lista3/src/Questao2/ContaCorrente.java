package Questao2;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;

    }

    @Override
    public boolean sacar(double valor) {
        if ( valor > 0 && ( consultarSaldo() + limiteChequeEspecial ) >= valor ) {
            double saldo = consultarSaldo();
            if ( saldo > valor ) {
                return super.sacar(valor);
            } else {
                double valorDoCheque = valor - saldo;

                super .sacar(saldo);
                limiteChequeEspecial = limiteChequeEspecial - valorDoCheque;
                return true;
            }
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
