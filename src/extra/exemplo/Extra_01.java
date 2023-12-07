package extra.exemplo;

public class Extra_01 {
    public static void main(String[] args) {

        String a = "Katlyn";
        String b = "Katlyn";
        String c = new String("Katlyn");

        System.out.println(a == "Katlyn");
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a == c);

        System.out.println(a.equals(c));
    }
}
