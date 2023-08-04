package aula04_08;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class EstudoContrutores {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<String>();
        produtos.add("Sapato");
        produtos.add("Cerveja");
        produtos.add("Livro");
        Venda venda1 = new Venda(LocalDate.now(), "José", produtos, 300.0);
        Venda venda2 = new Venda();
        Venda venda3 = new Venda(LocalDate.now());
        Venda venda4 = new Venda("Matheus");
        Venda venda5 = new Venda("Monique", LocalDate.now());
        System.out.println(venda1.toString());
    }
}
