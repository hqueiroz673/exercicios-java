package DiasDeVida;

import java.util.Scanner;

public class Main{
   public static void main(String[]arg) {
        Scanner leitor = new Scanner(System.in);

       System.out.println("Qual o seu nome?");
       String nome = leitor.nextLine();
       System.out.println("Qual sua idade?");
       int idade = leitor.nextInt();

       Pessoa p1 = new Pessoa(nome, idade);

       System.out.println(nome + ",os seus dias de vida são, aproximadamente: " + p1.Calculo() );
    }
}