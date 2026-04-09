package SistemaDeNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = leitor.nextLine();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = leitor.nextDouble();
            leitor.nextLine();
            alunos[i] = new Aluno(nome, nota);
        }

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNota() >= 7) {
                System.out.println("Aluno: " + alunos[i].getNome() + " foi aprovado");
            }
        }
        leitor.close();
    }
}