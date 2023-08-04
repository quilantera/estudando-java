package aula04_08.atividade;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AtividadeAula04_08 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", 30, "123.456.789-01");
        Cliente cliente2 = new Cliente("Maria Santos", 25, "987.654.321-09");
        Cliente cliente3 = new Cliente("Pedro Souza", 40, "456.789.123-45");
        Cliente cliente4 = new Cliente("Ana Oliveira", 35, "789.012.345-67");
        Cliente cliente5 = new Cliente("Carlos Pereira", 28, "234.567.890-90");
        Conta conta1 = new Conta("100",1000.0, cliente1);
        Conta conta2 = new Conta("200",500.0, cliente2);
        Conta conta3 = new Conta("300",2000.0, cliente3);
        Conta conta4 = new Conta(800.0, cliente4);
        Conta conta5 = new Conta(1500.0, cliente5);
        List <Conta> contas = new ArrayList(List.of(conta1,conta2,conta3,conta4,conta5));

        Banco banco = new Banco(contas);
        banco.criarConta(cliente1);
        banco.exibirContas();
        banco.bucarConta("200").sacar(200.40);
        banco.bucarConta("200").depositar(999.90);

    }
}
