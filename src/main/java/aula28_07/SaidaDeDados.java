package aula28_07;

import java.util.Scanner;

public class SaidaDeDados {
    public static void main(String[] args) {
        String java = new String("Java");
//        String java = "Java"; // um texto é um objeto
//        System.out.println(java.toLowerCase()); // minuscula
//        System.out.println(java.toUpperCase()); // maiuscula
//        System.out.println(java.charAt(3)); // caractere com base na sua posição
//        System.out.println(java.indexOf("va")); // indice do primeiro caractere da substring
//        System.out.println(java.replace("v", "c")); // subtituir o "v" por "c"
//        System.out.println(java.replaceAll("a", "i"));
//        System.out.println(java.substring(2, 4)); // indice incial, indice final + 1
//        System.out.println(java.length()); // tamanho do texto
//
//        String nome1 = "Estefane";
//        String nome2 = "EsteFane";
//        System.out.println(nome1 == nome2); // compara os objetos nome1 e nome2
//        System.out.println(nome1.equals(nome2)); // compara os textos de nome1 e nome2
//        System.out.println(nome1.equalsIgnoreCase(nome2));
//        System.out.println("texto".equals("texto2") && "texto2".equals("texto3"));
        Scanner ler = new Scanner(System.in);
        String texto = "Vamos para o break";
        System.out.println("digite seu nome");
        String nome = ler.nextLine();
        if(nome.isBlank()){
            System.out.println("conteudo vazio");
        } else if (nome.contains("gust")) {
            System.out.println("contem");
        }else{
            System.out.println("nao contem");
        }
    }
}
