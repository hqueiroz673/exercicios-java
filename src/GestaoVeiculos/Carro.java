package GestaoVeiculos;

public class Carro extends Veiculo {
    protected byte quantidadeDePortas;

    public Carro(String marca, String modelo,byte quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: "+ quantidadeDePortas);
    }
}
