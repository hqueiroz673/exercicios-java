package GestaoVeiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Fiat", "Uno", (byte)4);
        Veiculo v2 = new Moto("Honda", "CB 500", 500);

        v1.exibirDetalhes();
        v2.exibirDetalhes();
    }
}
