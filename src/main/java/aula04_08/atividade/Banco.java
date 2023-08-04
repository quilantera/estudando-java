package aula04_08.atividade;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }
    public void criarConta(Cliente cliente){
        Conta conta = new Conta(0.0,cliente);
        this.contas.add(conta);
    }
    public Conta bucarConta(String numeroConta){
        return  contas.stream().filter(conta -> numeroConta.equals(conta.getNumeroConta())).findFirst().orElse(null);
    }
    public void exibirContas(){
        contas.forEach(conta  -> System.out.println(conta));
    }



}
