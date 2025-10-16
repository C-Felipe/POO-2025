package Questao10;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        System.out.println("Iniciando download via HTTP de " + tamanhoTotal + " bytes...");

        int bytesRecebidos = 0;
        boolean continuar = true;

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos += 100;

            if (bytesRecebidos > tamanhoTotal) {
                bytesRecebidos = tamanhoTotal;
            }

            int progresso = (bytesRecebidos * 100) / tamanhoTotal;
            System.out.println("Progresso: " + progresso + "% (" + bytesRecebidos + "/" + tamanhoTotal + " bytes)");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("A thread foi interrompida.");
            }

            if (bytesRecebidos >= tamanhoTotal / 2) {
                continuar = false;
                System.out.println("Atingiu 50%. Download Pausado Automaticamente!");
            }
        }

        System.out.println("------------------------------------");
        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Status Final: Download Completo!");
        } else {
            System.out.println("Status Final: Download Pausado/Interrompido.");
        }
    }
}