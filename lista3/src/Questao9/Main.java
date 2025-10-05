package Questao9;

public class Main {
    public static void main(String[] args) {

        Livro livroGenerico = new Livro("Dom Casmurro", "Machado de Assis", 1899, 45.0);
        System.out.println("=== FICHA DO LIVRO ===");
        livroGenerico.exibirFichaCatalografica();
        System.out.println();

        LivroDidatico livroDidatico = new LivroDidatico("Matemática Básica", "Prof. Silva", 2020, 60.0, "Matemática");
        System.out.println("=== FICHA DO LIVRO DIDÁTICO ===");
        livroDidatico.exibirFichaCatalografica();
        System.out.println();

        LivroRaro livroRaro = new LivroRaro("As Aventuras de Huckleberry Finn", "Mark Twain", 1884, 150.0, true);
        System.out.println("=== FICHA DO LIVRO RARO ===");
        livroRaro.exibirFichaCatalografica();
        System.out.println();
    }
}
