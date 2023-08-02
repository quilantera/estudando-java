package aula01_08;

import java.time.LocalDateTime;
import java.util.*;

public class atividadeAula01082023 {
    public static void main(String[] args) {
        calculaEstacoes();
        boolean primo = verificaNumeroPrimo(5);
        System.out.println(primo);
        calculaSemanas();
        MediaAritmetica();
       maiorMenorNumero();

    }
    public static void maiorMenorNumero(){
        //Crie um programa que receba 5 números do usuário e armazene-os em uma lista. Em seguida, exiba o maior e o menor número da lista
        Scanner ler = new Scanner(System.in);
        List <Integer> numeros = new ArrayList<Integer>();
        System.out.println("Digite 5 numeros");
        for(int i =0; i< 5; i++){
            System.out.println("numero " + (i+1)+ ":");
            numeros.add(ler.nextInt());
        }
        Collections.sort(numeros);
        System.out.println("o menor numero é :"+numeros.get(0));
        System.out.println("o maior numero é :"+numeros.get(4) );
    }
    public static void MediaAritmetica(){
        //Implemente um método que receba uma lista de números e retorne a média aritmética dos elementos presentes na lista.
        Scanner ler = new Scanner(System.in);
        int tamVetor;
        System.out.println("Media aritmetica: escolha o tamanho do vetor");
        tamVetor = ler.nextInt();
        List <Double> numeros = new ArrayList<Double>();
        for(int i =0; i< tamVetor; i++){
            System.out.println("numero " + (i+1)+ ":");
            numeros.add(ler.nextDouble());
        }
        double soma = 0,media;
        for(double numero :  numeros){
            soma += numero;
        }
        media = soma/numeros.size();
        System.out.println("sua média é:"+media);
    }
    public static void calculaSemanas(){
        //Escreva um programa que calcule e exiba a data daqui a três semanas a partir da data atual.
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual.plusWeeks(3));
    }
    public static boolean verificaNumeroPrimo(int num){
        int contador = 0;
        for(int i=1; i<=num;i++){
            if(num%i == 0){
                contador++;
            }
        }
        if(contador >2){
            return(false);
        }
        return(true);
    }

    public static void calculaEstacoes(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um mes");
        int mes = ler.nextInt();
        if(mes >=1 && mes <=3){
            System.out.println(EstacoesDoAno.VERAO);
        }
        else if(mes >=4 && mes <= 6){
            System.out.println(EstacoesDoAno.OUTONO);
        }
        else if(mes >=7 && mes <= 9){
            System.out.println(EstacoesDoAno.INVERNO);
        }
        else{
            System.out.println(EstacoesDoAno.PRIMAVERA);
        }
    }
}
enum EstacoesDoAno{
    PRIMAVERA,VERAO,OUTONO,INVERNO;
}
