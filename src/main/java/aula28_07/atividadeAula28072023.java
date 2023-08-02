package aula28_07;

import java.util.Scanner;

public class atividadeAula28072023 {
    public static void main(String[] args) {

    ValidarUsuario();
    Somavetores();
    }
    public static void Somavetores(){
        int[] vetor1 = {1,2,3,4,5,6,7,8,9,10};
        int[] vetor2 = {10,9,8,7,6,5,4,3,2,1};
        int[] soma = new int[10];

        for(int i = 0; i<soma.length; i++){
            soma[i]= vetor1[i]+ vetor2[i];
            System.out.println(soma[i]);
        }
    }
    public static void ValidarUsuario(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um email");
        String email = ler.nextLine();
        System.out.println("digite a senha");
        String senha = ler.nextLine();

        if(email.isBlank()|| senha.isBlank()){
            System.err.println("por favor preencher email e senha");
        }
        else if(!email.contains("@soulcode.com")){
            System.err.println("email invalido");
        }
        else if(senha.length() < 8){
            System.err.println("senha invalida");
        }
        else{
            System.out.println("bem vindo Usuário");
        }
    }
}
