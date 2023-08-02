package aula31_07;

enum NivelAcesso {
    COMUM, USUARIO, ADMINISTRADOR
}

class Pessoa {
    String nome;
    int idade;
    NivelAcesso nivelAcesso;
}

 class EstudoEnums {

    public static void main(String[] args) {
        Pessoa davi = new Pessoa();
        davi.nome = "Davi";
        davi.idade = 8;
        davi.nivelAcesso = NivelAcesso.USUARIO;

        if(davi.nivelAcesso == NivelAcesso.ADMINISTRADOR) {
            System.out.println("Libera tudo!");
        }
        else if(davi.nivelAcesso == NivelAcesso.USUARIO) {
            System.out.println("Libera somente area privada!");
        }
        else if(davi.nivelAcesso == NivelAcesso.COMUM) {
            System.out.println("Libera somente area publica!");
        }
    }
}