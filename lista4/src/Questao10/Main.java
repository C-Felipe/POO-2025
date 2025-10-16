package Questao10;

public class Main {

    public static void main(String[] args) {
        ITransferencia minhaTransferencia = new TransferenciaHTTP();

        minhaTransferencia.iniciarDownload(2000);
    }
}
