public class PT7_1_ForEach {
    public static void main(String[] args) {
        String[] frutas = new String[] { "Maçã", "Laranja", "Uva", "Goiaba" };
        //                                 0        1         2       3

//        for (int i = 0; i < 4; i++) {
//            System.out.println(frutas[i]);
//        }
//        System.out.println("For each");
//
//        for(String fruta: frutas) {
//            System.out.println(fruta);
//        }
//
//        System.out.println();
//        System.out.println("Separacao");
//        System.out.println();

//        for (int i = 0; i < 4; i++) {
//            if (i == 2) {
//                System.out.println("Minha fruta favorita é " + frutas[i]);
//            } else {
//                System.out.println(frutas[i]);
//            }
//        }
//
//        for (int i = 3; i >=0; i--) {
//            System.out.println(frutas[i]);
//        }


        int[] notas = new int[] {10, 5, 7, 8};

        int somaDasNotas = 0;

        for (int nota: notas) {
            somaDasNotas = somaDasNotas + nota;
        }
        System.out.println(somaDasNotas);

        System.out.println("---------------------------------");

        int somaDasNotas2 = 0;

        for (int i = 0; i < 4; i++) {
            if(i == 3) {
                somaDasNotas2 = somaDasNotas2 + (notas[i] * 2);
            } else {
                somaDasNotas2 = somaDasNotas2 + notas[i];
            }
        }

        System.out.println(somaDasNotas2);
    }
}
