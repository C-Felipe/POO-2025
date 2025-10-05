package Questao8;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> ingredientesBasicos = new ArrayList<>();
        ingredientesBasicos.add("Arroz");
        ingredientesBasicos.add("Feijão");
        ingredientesBasicos.add("Carne");

        Prato pratoGenerico = new Prato("Prato do Dia", 25.0, 20, ingredientesBasicos);
        System.out.println("=== CARDÁPIO DO PRATO COMUM ===");
        pratoGenerico.exibirCardapio();
        System.out.println();

        List<String> ingredientesVeganos = new ArrayList<>();
        ingredientesVeganos.add("Quinoa");
        ingredientesVeganos.add("Vegetais");
        ingredientesVeganos.add("Tofu");
        PratoVegano pratoVegano = new PratoVegano("Salada Vegana", 30.0, 15, ingredientesVeganos, "Certificado pela Vegan Society");
        System.out.println("=== CARDÁPIO DO PRATO VEGANO ===");
        pratoVegano.exibirCardapio();
        System.out.println();

        // Criando um prato gourmet
        List<String> ingredientesGourmet = new ArrayList<>();
        ingredientesGourmet.add("Filé mignon");
        ingredientesGourmet.add("Trufas");
        ingredientesGourmet.add("Molho especial");
        PratoGourmet pratoGourmet = new PratoGourmet("Filet Gourmet", 80.0, 30, ingredientesGourmet, "Chef João Silva");
        System.out.println("=== CARDÁPIO DO PRATO GOURMET ===");
        pratoGourmet.exibirCardapio();
        System.out.println();

    }
}

