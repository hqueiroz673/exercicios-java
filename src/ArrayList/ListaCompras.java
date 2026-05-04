package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        String entrada;

        System.out.println("--- Lista de Compras ---");
        System.out.println("Digite o nome do produto ou 'sair' para finalizar:");

        while (true) {
            System.out.print("Produto: ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            produtos.add(entrada);
        }

        System.out.println("\n--- Itens na Lista ---");
        for (String item : produtos) {
            System.out.println("- " + item);
        }

        System.out.println("\nTotal de itens comprados: " + produtos.size());

        scanner.close();
    }
}