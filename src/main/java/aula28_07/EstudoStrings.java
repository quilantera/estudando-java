package aula28_07;

public class EstudoStrings {
    public static void main(String[] args) {
        String java = "Java"; // Um texto é um objeto
        System.out.println(java.toLowerCase()); //Minuscula
        System.out.println(java.toUpperCase()); //Maiuscula
        System.out.println(java.charAt(3)); //caracter com a posicao 3;
        System.out.println(java.replace("j","c"));
        System.out.println(java.replaceAll("a","i"));
        System.out.println(java.substring(2,4));

        String nome1 ="Stephanie";
        String nome2 ="Gustavoos";
        System.out.println(nome1 == nome2);// compara os objetos nome1 e nome2
        System.out.println(nome1.equals(nome2)); // compara os textos de nome1 e nome 2
    }
}
