public class PT9_1_Funcoes {

    public static void main(String[] args) {
        divisaoComRetorno(2, 0);
    }

    public static void divisao(double num1, double num2) {
        System.out.println("Voce esta dividindo dois valores, são eles:");
        System.out.println(num1);
        System.out.println(num2);

        double result;
        if(num2 == 0.0) {
            System.out.println("Divisao por zero é invalida!");
            return; // pare a execucao // Exception
        } else {
            result = num1/num2;
            System.out.println(result);
        }

        System.out.println("Divisao realizada com sucesso!");
    }

    public static double divisaoComRetorno(double num1, double num2) {
        System.out.println("Voce esta dividindo dois valores, são eles:");
        System.out.println(num1);
        System.out.println(num2);

        double result;
        if(num2 == 0.0) {
            System.out.println("Divisao por zero é invalida!");
            return -1; // Exception
        } else {
            result = num1/num2;
            System.out.println(result);
        }

        System.out.println("Divisao realizada com sucesso!");
        return result;
    }

    public static int somaComRetorno(int a, int b, int c) {
        System.out.println("Voce esta somando tres valores, são eles:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int resultado = a + b + c;

        return resultado;
    }



    // Modificadores
    // public - todas as classes podem acessar
    // private - apenas a classe que declarou o metodo

    // Tipo de Retorno
    // void - não tem retorno (return)
    public static void soma(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtracao(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiplicacao(int a, int b) {
        System.out.println(a * b);
    }

    public static void operacao(int a, int b, String op) {
        if(op.equals("soma")) {
            soma(a, b);
        } else if(op.equals("sub")) {
            System.out.println(a - b);
        } else if(op.equals("div")) {
            System.out.println(a/b);
        } else if (op.equals("mult")){
            System.out.println(a*b);
        } else {
            System.out.println("Operacao invalida");
        }
    }

    public static int operacaoComRetorno(int a, int b, String op) {
        if(op.equals("soma")) {
            return a + b;
        } else if(op.equals("sub")) {
            return a - b;
        } else if(op.equals("div")) {
            return a / b;
        } else if (op.equals("mult")){
            return a * b;
        } else {
            return -1;
        }
    }

    // [modificador acesso (ex: public - private)] tipo_de_retorno nome_do_metodo(argumentos) {
    // }
}
