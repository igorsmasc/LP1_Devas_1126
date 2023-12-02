public class PT5_IfElse {
    public static void main(String[] args) {
        // If
        // Else

        double nota = 0;
        String nome = "Grazi";
        boolean filhaDoDiretor = true;
        String teste = "";
        if(nota >= 7 || filhaDoDiretor) {
            System.out.println("Aprovada!");
        } else {
            System.out.println("Reprovada!");
        }

        // ----------------------------------------

        // Se nota maior ou igual a 90 -> A
        // Se nota for maior ou igual a 80 -> B
        // Se nota for maior ou igual a 70 -> C
        // Se not for menor que 70 -> Z

        int notaGeral = 85;
        char grade;

        // Switch/case

        if(notaGeral >= 90) {
            grade = 'A';
        } else if(notaGeral >= 80) {
            grade = 'B';
        } else if(notaGeral >= 70) {
            grade = 'C';
        } else {
            grade = 'Z';
        }

        System.out.println(grade);
    }
}
