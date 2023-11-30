public class PT1_HelloWorld {
    public static void main(String[] args) {
        // print
        System.out.print("Hello, World! - print\n");
        System.out.println("Hello, World! - println"); // ln - line
        System.out.print("Hello, World!\n");

        // printf - format
        System.out.printf("Hello, %s\n", "World"); // formatted
        System.out.printf("Hello, %s%n", "World"); // Priorizem o %n


        /**
         *
         * %d - representa números inteiros
         * %f - representa números floats
         * %2f - representa números doubles
         * %b - representa valores booleanos
         * %c - representa valores char
         * %v -
         */
        System.out.println("-----------------------------");

        System.out.printf("%d %n", 1);
        System.out.printf("%d %n", 15/2); // operacao int x int = int | 1.5 x 1
        System.out.printf("%f %n", 1.5);
        System.out.printf("%.4f %n", 1.51119999999); // BigDecimal
        System.out.printf("%b %n", true);
    }
}
