package aula01_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoListas {
    public static void main(String[] args) {
        //vetor -> inflexivel
        //lista -> flexivel

        // generic -> <tipo>
        List <Integer> lista = new ArrayList<Integer>(); //compativel
        lista.add(9);
        lista.add(52);
        lista.add(14);
        lista.add(73);

        lista.size(); // tamanho da lista
        System.out.println(lista.get(2));
        lista.remove(2);
        lista.add(2,7);
        System.out.println(lista.get(2));

        for (int i= 0; i < lista.size(); i++){
            System.out.print(" "+lista.get(i));
        }
        Collections.sort(lista);
        System.out.println();
        for(Integer numero : lista){
            System.out.print(" "+numero);
        }
        List<String> nomes = List.of("Gustavo","Gabriel","Carlos");
        List <String> listaNomes = new ArrayList<String>(nomes); //compativel
        Collections.sort(listaNomes);
        //imprimir lista ordenada
        for(String nome : listaNomes){
            System.out.print(" "+nome);
        }
    }
}
