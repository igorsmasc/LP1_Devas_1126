public class PT3_Datatypes {
    public static void main(String[] args) {
        /**
         *
         * JAVA é uma linguagem fortemente tipada, ou seja,
         * as váriaveis precisam ter seu tipo definido na sua criação.
         * Após a criação de uma variavel seu tipo não muda.
         *
         */

        // Outra linguagem interessante para pesquisa
        // Similar ao java - Kotlin
        // Outras - Golang (Google)

        // Tipos primitivos: Tipos de dados fundamentais
        var teste = 1.0;

        // Oito tipos primitivos

        // Inteiros
        byte numByte = 127; // 1 byte | -128 a 127
        short numShort = 2; // 2 bytes | -32.768 a 32.767
        int numInt = 3; // 4 bytes | -2.147.483.648 a 2.147.483.647
        long numLong = 4L; // 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numLong2 = 40_000_000_000L;

        int idade; // padrão
        long valoresMaiores;

        System.out.println(numLong);
        System.out.println(numLong2);

        String numPedido = "12399123456"; // Regex

        // Números de ponto flutuante
        float numFloat = 1.5111111f; // 4 bytes | 6-7 dígitos decimais significativos
        double numDouble = 1.500000000000; // 8 bytes | 15 dígitos decimais significativos

        System.out.println(numFloat);

        /**
         *
         * O tipo double tem o dobro da precisão do tipo float.
         * Para tipos decimais, esse tipo, geralmente, é a escolha padrão.
         * Porém, ele nunca deve ser usado para representar valores exatos, como moedas.
         * Nesse caso, use BigDecimal.
         *
         */

        // Outros tipos primitivos
        boolean typeBoolean = true;
        boolean typeBoolean2 = false;

        char umLetraOuUmChar = 'a';

        // STRING NÃO É UM TIPO PRIMITIVO
        String nome = "Um frase aqui";
        String nome2 = "Um frase \"aqui\"";
        System.out.println(nome);
        System.out.printf(nome2);

        double valor = 12.3;
        valor = 10;

        final double PI = 3.14;

        final double VALOR_DE_PI = 3.14;
    }
}
