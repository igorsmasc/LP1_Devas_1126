public class PT6_Switch {
    public static void main(String[] args) {
        // ----------------------------------------
        // Se nota maior ou igual a 90 -> A
        // Se nota for maior ou igual a 80 -> B
        // Se nota for maior ou igual a 70 -> C
        // Se not for menor que 70 -> Z
        int notaGeral = 70;
        char grade;

        // Switch/case
        if(notaGeral >= 90) {
            System.out.println(">=90");
        } else if(notaGeral >= 80) {
            System.out.println(">=80");
        } else if(notaGeral >= 70) {
            System.out.println(">=70");
        } else {
            System.out.println("Nao passou");
        }

        System.out.println("Separacao ------------------");

        switch (notaGeral) {
            case 90100:
                System.out.println("Parabéns");
                break;
            case 70:
                System.out.println("Foi por pouco!");
                break;
            default:
                System.out.println("Não passou!");
                break;
        }
    }
}
