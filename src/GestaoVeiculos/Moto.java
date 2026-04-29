package GestaoVeiculos;

public class Moto extends Veiculo {
    protected int cilindradas;

    public Moto(String marca, String modelo,int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilidrandas: "+ cilindradas);
    }
}
