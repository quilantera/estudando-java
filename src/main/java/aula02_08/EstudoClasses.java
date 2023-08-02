package aula02_08;

public class EstudoClasses {
    // Classes -> Fruta(Modelagem);
    // Objetos -> Maça, Pera, Morango, Banana;
    // Instancias -> Processo que constroi um objeto a partir de uma classe;
    // Atributo/ Popriedade -> Um valor definido na classe incorporado no objeto;
    // Metodos/ Funções
    public static void main(String[] args) {
        Fruta maca = new Fruta();
        maca.nome = "maca";
        maca.cor = "vermelho";
        maca.madura = true;
    }
}
