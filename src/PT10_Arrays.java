public class PT10_Arrays {
    public static void main(String[] args) {
        // Vetor com valores definidos
        int[] nums = new int[]{1, 2, 3, 4, 5};


        System.out.println("----------------");

        // Vetor sem valores definidos
        int[] nums2 = new int[5]; // -> [0, 0, 0, 0, 0]


        // Por o vetor é como é?
        // 1 - Por que precisamos definir um tipo?
        // 2 - Por que precisamos definir o tamanho?
        // 3 - Por que inicia com indice zero?


        double[] notas = new double[4];
        notas[0] = 10.0;
        notas[1] = 5.0;
        notas[2] = 7.5;
        notas[3] = 9.0;

        media(notas);
    }

    public static void media(double[] notas) {
        double somaDasNotas = 0;
        for(int i = 0; i < notas.length; i++) {
            somaDasNotas += notas[i];
        }
//        for(double nota: notas) {
//            somaDasNotas += nota;
//        }

        double media = somaDasNotas/notas.length;

        System.out.println(media);
    }

}
