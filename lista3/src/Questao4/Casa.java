package Questao4;

public class Casa extends Imovel{
    private double areaQuintal;
    private boolean temPiscina;

    public Casa (String endereco, double area, int numeroQuartos, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao(){
        return 0.10 * preco;
    }

    @Override
    public void exibirCaracteristicas(){
        super.exibirCaracteristicas();
        System.out.println("Área do quintal: " + areaQuintal);
        System.out.println("Tem piscina: " + (temPiscina ? "Sim" : "Não"));
        System.out.println("Taxa de administração da casa: R$ " + calcularTaxaAdministracao());
    }
}
