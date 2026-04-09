package CalculoMedia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Sistema de Média ---");

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
        CalculadoraMedia calc = new CalculadoraMedia(nota1, nota2, nota3);
        double mediaFinal = calc.calcular();

        System.out.println("\n--- Resultado ---");
        System.out.printf("A média das notas é: %.2f%n",
                calc.getN1(), calc.getN2(), calc.getN3(), mediaFinal);

        leitor.close();
    }
}