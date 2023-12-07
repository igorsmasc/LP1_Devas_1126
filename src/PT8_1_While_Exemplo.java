import java.util.Scanner;

public class PT8_1_While_Exemplo {

    /**
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Mostrar velocidade atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meu carro
        String cor = "Azul";
        String marca = "Fiat";
        String modelo = "Mobi";

        boolean ligado = true;
        int velocidadeAtual = 0;

        int escolha;

        while (ligado) {// Enquanto meu carro estiver ligado ->
            System.out.println();
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Mostrar velocidade atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operacao: ");
            System.out.println();
            escolha = input.nextInt(); // Entrada do usuario

            System.out.println("A velocidade atual é de: " + velocidadeAtual + " km/h");

            if(escolha == 1) {
                velocidadeAtual += 10;
            } else if(escolha == 0) {
                ligado = false;
            } else {
                System.out.println("Valor invalido!");
            }
        }

    }
}
