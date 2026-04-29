package CadastroFuncionario;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionário " + (i + 1));
            System.out.print("Tipo (gerente/vendedor): ");
            String tipo = sc.nextLine().toLowerCase();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário base: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            if (tipo.equals("gerente")) {
                funcionarios.add(new Gerente(nome, salario));
            } else if (tipo.equals("vendedor")) {
                System.out.print("Total de vendas: ");
                double vendas = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new Vendedor(nome, salario, vendas));
            }
        }

        System.out.println("\n--- Relatório ---");
        for (Funcionario f : funcionarios) {
            String tipo = (f instanceof Gerente) ? "Gerente" : "Vendedor";
            System.out.println(f.nome + " (" + tipo + ") - Salário: R$ " + f.calcularSalario());
        }
        sc.close();
    }
}