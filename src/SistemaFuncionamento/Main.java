package SistemaFuncionamento;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana", 4000, 560.4);
        Programador p1 = new Programador("Juan", 5000, 462.64);

        System.out.println("Salário da " + g1.nome + ": " + g1.calcularSalario());
        System.out.println("Salário da " + p1.nome + ": " + p1.calcularSalario());
    }
}
