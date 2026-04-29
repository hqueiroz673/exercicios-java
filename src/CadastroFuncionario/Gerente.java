package CadastroFuncionario;

public class Gerente extends Funcionario {
    private double bonusFixo = 500.00;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase); // chama o construtor de Funcionario
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusFixo;
    }
}