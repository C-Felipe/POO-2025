package Questao1;

public class Fatura implements IImprivel {

    @Override
    public void imprimir(int copias){
        if(copias > 5){
            System.out.println("Imprimindo " + copias + " copiasem modo rascunho");
        } else {
            System.out.println("Imprimindo " + copias + " copias em modo alta qualidade");
        }
    }
}
