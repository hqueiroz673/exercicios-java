package SistemaFuncionamento;

public class Programador extends Funcionario{
    protected double adicionalProjeto;
    public Programador(String nome, double salarioBase, double adicionalProjeto){
        super(nome, salarioBase);
        this.adicionalProjeto = adicionalProjeto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalProjeto;
    }
}
