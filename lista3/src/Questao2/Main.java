package Questao2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345-6", "Felipe Lopes", 1000.0);
        System.out.println("Saldo inicial conta1: " + conta1.consultarSaldo());
        conta1.depositar(760);
        System.out.println("Saldo após depósito conta1: " + conta1.consultarSaldo());
        boolean saque1 = conta1.sacar(200);
        System.out.println("Saque de 200 conta1 realizado? " + saque1);
        System.out.println("Saldo após saque conta1: " + conta1.consultarSaldo());

        System.out.println("-----------------------------");


        ContaCorrente conta2 = new ContaCorrente("98765-4", "Bruno Silva", 1000.0, 500.0);
        System.out.println("Saldo inicial conta2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial conta2: " + conta2.getLimiteChequeEspecial());

        boolean saque2 = conta2.sacar(1200);
        System.out.println("Saque de 1200 conta2 realizado? " + saque2);
        System.out.println("Saldo após saque conta2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial restante conta2: " + conta2.getLimiteChequeEspecial());

        boolean saque3 = conta2.sacar(400);
        System.out.println("Saque de 400 conta2 realizado? " + saque3);
        System.out.println("Saldo após saque conta2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial restante conta2: " + conta2.getLimiteChequeEspecial());
    }
}

