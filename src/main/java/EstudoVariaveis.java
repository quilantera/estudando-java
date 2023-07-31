public class EstudoVariaveis {
    //varável = conteiner de dados
    //tipagem forte = define o tipo de cada variável
    public static void main(String[] args){
        // para definir uma variável
        // <tipo> <nome> = <valor>;

        //tipos primitivos (surgiram com a linguagem) : int, long ,char , boolean, double, float
        //tipos nao primitivos (foram implementados depois): String, ArrayList, List...

        //Como declarar variaveis

        int estoque = 150;
        // L = sufixo para representar long

        long populacaoTerra = 7900000000L; // até na casa dos quintilhões7
        double salarioDev = 5500.99; // até 15 casas de precisão
        // F = sufixo para representar float
        float nota = 7.5F; // até 7 casas de precisão
        boolean ativo = true; //true, false
        String nome = "Gustavo"; // usamos " sempre!
        char letra = 'G';

        //tipagem forte
        int a = 1000;
        a = 2000; //reatribuição/ atualização
        // a = batata; -> impossivel pois nao é do mesmo tipo
        System.out.println(a);
    }
}
