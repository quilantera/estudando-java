package aula04_08.atividade;

import java.util.Random;

public class Conta {
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(String numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public Conta(double saldo, Cliente cliente) {
        this.numeroConta = gerarStringAleatoria(10);
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void depositar(double valor){
        if(valor < 0 ){
            valor = 0-valor;
        }
        setSaldo(this.saldo + valor);
        System.out.println("depositado: Saldo total: "+ getSaldo());
    }
    public void sacar(double valor){
        if(valor < 0) {
            valor = 0 - valor;
        }
        setSaldo(this.saldo - valor);
        System.out.println("sacado: saldo total: "+getSaldo());
    }
    public static String gerarStringAleatoria(int tamanho) {
        final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(tamanho);
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = random.nextInt(CARACTERES.length());
            char caractereAleatorio = CARACTERES.charAt(indiceAleatorio);
            sb.append(caractereAleatorio);
        }

        return sb.toString();
    }
    @Override
    public String toString(){
        return "conta{"+
                " numeroConta: "+ getNumeroConta()+
                " |saldo: " + getSaldo() +
                " |cliente: " + getCliente() +
                " }";
    }
}
