public class EstudoOperadores {
    public static void main(String[] args){
        // Operadores matemáticos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtracao = a - b;
        int mult = a * b;
        double divisao = ((double) a / b) ;

        System.out.println("a :"+ a);
        System.out.println("b :"+ b);
        System.out.println("soma :"+ soma);
        System.out.println("subtracao :"+ subtracao);
        System.out.println("multiplicação :"+ mult);
        System.out.println("divisão :"+ divisao);

        // operadores entre doubles e int => double
        int c = 10;
        double d = 22.0;
        double divisao2 = c / d;
        System.out.println("divi 2: "+ divisao2);

        // Math
        double potencia = Math.pow(2,3);
        double raizQ = Math.sqrt(144);
        System.out.println("portencia :"+ potencia);
        System.out.println("raiz quadrada: "+ raizQ);

        System.out.println(Math.PI);

        // incremento/decremento
        int valor = 5;
        valor++; // adiciona 1;
        valor--; // retira 1;
        valor += 10;

        // Operadores relacionais
        boolean teste1 = 10 > 5;
        boolean teste2 = 5 < 1;
        boolean teste3 = 5 == 5;
        boolean teste4 = 4 != 4;
        boolean teste5 = 5 >= 5;
        boolean teste6 = 6 <= 6;
        // Operadores logicos
        boolean teste7 = true && true;
        boolean teste8 = true || false;
        boolean teste9 = (5>10) && (8>4);
        boolean teste10 = (10>=8) || (1< 5);
        boolean teste11 = !teste1; //false;
        double peso = 84.5;
        double altura = 1.95;
        double imc = peso/ Math.pow(altura,2);
        System.out.println("imc:" + imc);
    }

}
