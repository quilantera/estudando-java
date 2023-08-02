package aula26_07;

import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        //Scanner permite a leitura de dados do teclado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu nome:" );
        String nome = entrada.nextLine();// nextLine() ->string nextInt() -> int

        System.out.println("seu nome é: "+ nome);
        System.out.println("digite sua altura:");
        double altura = entrada.nextDouble();
        System.out.println("digite sua peso:");
        double peso = entrada.nextDouble();
        double imc = peso/ Math.pow(altura,2);
        if(imc < 17) {
            System.out.println("Muito abaixo do peso.");
        } else if(imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");
        } else if(imc >= 30 && imc < 35) {
            System.out.println("Obesidade I");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }
        System.out.println("selecione uma dieta(1 a 3)");
        System.out.println("1- agua");
        System.out.println("2- fruta");
        System.out.println("3- carne");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("voce escolheu a dieta da agua");
                break;
            case 2:
                System.out.println("voce escolheu a dieta da fruta");
                break;

            case 3:
                System.out.println("voce escolheu a dieta da carne");
                break;
            default:
                System.out.println("valor invalido");
                break;
        }
        String mensagem = (altura >= 1.5)?"voce tem tamanho padrao": "voce é anao";
        System.out.println(mensagem);
    }
}
