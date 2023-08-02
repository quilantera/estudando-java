public class EstudoMetodos {
    // Métodos/Funções -> São estruturas que executam  uma determinada  tarefa/atividade

    //Funções que recebem Parametros e quem nao rebem;
    //Funções que Retorna Valores e quem nao retorna;
    public String bemVindo(String nome){
        return "Bem vindo "+ nome;
    }
    public void imprimir(String texto){
        System.out.println(texto);

    }
    public static double soma(double n1, double n2, double n3){
        double s = n1 + n2 + n3;
        return s;
    }
    public static void main(String[] args){ // um metodo estatico só reconhece outros metodos statics;
        soma(13.5,11.2,7.4);
    }
}
