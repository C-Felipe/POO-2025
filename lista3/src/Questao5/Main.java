package Questao5;

public class Main {
    public static void main(String[] args) {

        ProdutoEletronico produtoGenerico = new ProdutoEletronico("Generic", "Model X", 1000.0, 110);
        System.out.println("=== ESPECIFICAÇÕES DO PRODUTO ELETRÔNICO ===");
        produtoGenerico.exibirEspecificacoes();
        System.out.println();

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 2000.0, 110, 6.2, 4000);
        System.out.println("=== ESPECIFICAÇÕES DO SMARTPHONE ===");
        smartphone.exibirEspecificacoes();
        System.out.println();

        Notebook notebook = new Notebook("Dell", "Inspiron 15", 3000.0, 110, "Intel i5", 8);
        System.out.println("=== ESPECIFICAÇÕES DO NOTEBOOK ===");
        notebook.exibirEspecificacoes();
        System.out.println();
        }
    }