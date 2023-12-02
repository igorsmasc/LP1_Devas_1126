public class PT4_Operadores {
    public static void main(String[] args) {

        // Aritméticos: soma (+), subtração (-), multiplicação (*) e divisão (/);

        // +
        // Ex:
        // 1 - Numero + Numero = Soma
        // -> 1 + 2 = 3

        // 2 - Numero + String = Concatena
        // -> "a" + 2 = "a2"

        int a = 2;
        int b = 2;

        int c = a + b;
        //System.out.printf("Soma: " + c);
        c = a - b;
        c = a / b;
        c = a * b;

        // Lógicos: negação (!), E (&&), OU (||) // duplo pipe

        boolean isSomething = false;
        System.out.println("Something");
        System.out.println(!isSomething);

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // Relacionais: maior que (>), menor que (<), igual (==), diferente (!=)
        // >= e <=

        System.out.println("Relacionais");
        System.out.println(2 > 1);
        System.out.println(2 < 1);
        System.out.println(2 == 2);
        System.out.println(2 != 1);
        System.out.println(2 >= 2);
        System.out.println(2 <= 2);

        // Um operador aritmético especial
        // %
        int resultado = 3 % 2;
        System.out.println(resultado);

        // Incremento ++ e decremento --
        System.out.println("Incremento e decremento");
        int num = 1;
        num++;
        System.out.println(num);

        int num2 = 10;
        num2--;
        System.out.println(num2);
    }
}
