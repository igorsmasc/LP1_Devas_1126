public class PT1_HelloWorld {
    public static void main(String[] args) {
        // print
        System.out.print("Hello, World! - print\n"); // %n equivalente ao \n, porém so funciona no printf

        int a = 10;
        int b = 120;
        int c = a + b;
        System.out.println("O valor da operacao é " + c + " reais!");
        System.out.print("teste");
        System.out.println("Hello, World! - println"); // ln - line

        // printf - format
        String nome = "Alice";
        int idade = 25;

        System.out.println("A " + nome + " tem " + idade + " anos de idade");
        System.out.printf("A %s tem %d anos de idade%n", nome, idade);

        /**
         * Converters
         *
         * %d - representa números inteiros
         * %f - representa números floats
         * %2f - representa números doubles
         * %b - representa valores booleanos
         * %c - representa valores char
         * %s - recebe uma string
         */

        System.out.println("-----------------------------");

        System.out.printf("%d %n", 1);
        System.out.printf("%d %n", 15/2); // operacao int x int = int | 1.5 x 1
        System.out.printf("%f %n", 1.5);
        // BigDecimal
        System.out.printf("%b %n", true);

        System.out.printf("%2f %n", 7.51119999999);
        // log.info
        // log.error
        // log.debug
    }
}
