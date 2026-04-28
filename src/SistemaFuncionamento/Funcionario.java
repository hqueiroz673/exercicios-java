package SistemaFuncionamento;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public double calcularSalario(){
        return salarioBase;
    }

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

}
