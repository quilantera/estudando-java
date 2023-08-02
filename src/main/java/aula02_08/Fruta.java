package aula02_08;

public class Fruta {
    String nome;
    String cor;
    boolean madura;
    void amadurecer(int dias){
            if(dias < 30 && dias > 60 ){
                madura = false;
            }
            else {
                madura = true;
            }
    }
}
