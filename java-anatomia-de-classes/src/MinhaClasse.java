public class MinhaClasse {
    public static void main(String[] args) {

        // System.out.print("Olá turma, sejam bem-vindos");
        /*
         * // int ano = 2021;
         * //ano = 2022;
         * //final String BR = "Brasil";
         * String meuNome = "Gleyson";
         * int anoFabricacao = 2022;
         * boolean verdadeiro = true;
         */
        String primeiroNome = "João Marcos";
        String segundoNome = "Soares";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do méotodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
