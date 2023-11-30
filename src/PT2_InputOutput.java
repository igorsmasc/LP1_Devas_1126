import java.util.Scanner;

public class PT2_InputOutput {
    public static void main(String[] args) {
        System.out.println("Boa noite, qual o seu nome?");

        Scanner input = new Scanner(System.in); //
        String txt = input.nextLine();

        System.out.println("Boa noite, " + txt);

        /**
         *
         * Desafio
         *
         * Escrever um programa que printa o nome do usuário
         *
         */
    }
}
