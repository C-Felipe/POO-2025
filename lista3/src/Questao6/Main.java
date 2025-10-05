package Questao6;

public class Main {
    public static void main(String[] args) {

        Midia midia = new Midia("La La Land",2016, 128, 14.90);
        System.out.println("===== INFORMNAÇÕES DA MÍDIA =====");
        midia.exibirInfo();
        System.out.println("\n");

        Filme filme = new Filme("Stand By Me", 1986, 85, 12.90, "Rob Reiner", "Aventura");
        System.out.println("===== INFORMNAÇÕES DO FILME =====");
        filme.exibirInfo();
        System.out.println("\n");

        Serie serie = new Serie("Arrow", 2012, 40, 5.90, 8, 23);
        System.out.println("===== INFORMNAÇÕES DA SÉRIE =====");
        serie.exibirInfo();
        System.out.println("\n");
    }
}
