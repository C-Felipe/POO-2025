package Questao2;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345-6", "Felipe Lopes", 1000.0);
        System.out.println("Saldo inicial da conta-1: " + conta1.consultarSaldo());
        conta1.depositar(760);
        System.out.println("Saldo após depósito na conta-1: " + conta1.consultarSaldo());
        boolean saque1 = conta1.sacar(200);
        System.out.println("Saque de 200 da conta-1 realizado? " + saque1);
        System.out.println("Saldo após saque da conta-1: " + conta1.consultarSaldo());

        System.out.println("-----------------------------");

        ContaCorrente conta2 = new ContaCorrente("98765-4", "Erica Lopes", 1000.0, 500.0);
        System.out.println("Saldo inicial da conta-2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial da conta-2: " + conta2.getLimiteChequeEspecial());

        boolean saque2 = conta2.sacar(1200);
        System.out.println("Saque de 1200 da conta-2 realizado? " + saque2);
        System.out.println("Saldo após saque da conta-2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial restante da conta-2: " + conta2.getLimiteChequeEspecial());

        boolean saque3 = conta2.sacar(400);
        System.out.println("Saque de 400 da conta-2 realizado? " + saque3);
        System.out.println("Saldo após saque da conta-2: " + conta2.consultarSaldo());
        System.out.println("Limite cheque especial restante da conta-2: " + conta2.getLimiteChequeEspecial());

        System.out.println("-----------------------------");

        ContaPoupanca conta3 = new ContaPoupanca("55555-5", "Frank Lopes", 2000.0, 0.01); // 1% de rendimento
        System.out.println("Saldo inicial da conta-3 (poupança): " + conta3.consultarSaldo());
        conta3.aplicarRendimento();
        System.out.println("Saldo após aplicar rendimento da conta-3: " + conta3.consultarSaldo());
    }
}

