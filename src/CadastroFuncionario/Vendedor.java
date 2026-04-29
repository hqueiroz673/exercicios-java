package CadastroFuncionario;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissao = 0.10;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * comissao);
    }
}