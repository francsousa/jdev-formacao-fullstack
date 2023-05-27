public class Variaveis {

    private static double total = 0;

    private static int produtos = 10;

    private static int quantidade = 15;

    private static String nome = "Alex Fernando";

    private static int idade = 31;

    public static void main(String[] args) {
        total = produtos * quantidade;
        System.out.println(total);

        total = (produtos * quantidade) * 5;
        System.out.println(total);

        if (idade == 31) {
            System.out.println(nome);
        }

        idade = 33;

        if (idade == 33) {
            nome += " Egidio";
            System.out.println(nome);
        }
    }
}
