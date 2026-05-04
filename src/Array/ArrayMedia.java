package Array;

import java.util.Scanner;

public class ArrayMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "1 nota: ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("--- Resultado ---");
        System.out.printf("A média aritmética é: " + media);

        entrada.close();
    }
}