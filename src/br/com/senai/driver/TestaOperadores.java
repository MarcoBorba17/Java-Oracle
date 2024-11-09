package br.com.senai.driver;

public class TestaOperadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int x = 5;
        int y = 3;

        int soma = x + y;
        System.out.println(soma);

        double a = 10.5;
        double b = 2.2;

        double diferenca = a - b;
        System.out.println(diferenca);

        int num1 = 4;
        int num2 = 6;

        int produto = num1 * num2;
        System.out.println(produto);

        double dividendo = 20;
        double divisor = 4;

        double resultado = dividendo / divisor;
        System.out.println(resultado);

        int iDividendo = 17;
        int iDivisor = 4;

        int iResultado = iDividendo / iDivisor;
        System.out.println(iResultado);

        int numero = 17;
        iDivisor = 4;

        int resto = numero % iDivisor;
        System.out.println(resto);

        int numeroAleatorio = -1;
        if ((numeroAleatorio % 2) == 0) {
            System.out.printf("Número %d é par!", numeroAleatorio);
        } else {
            System.out.printf("Número %d é impar!", numeroAleatorio);
        }

        int contador = 0;
        contador++;

        System.out.println(contador);

        int valor = 10;
        valor--;

        System.out.println(valor);

        int x1 = 5;
        int y1 = ++x1;

        System.out.printf("O valor de x1 = %d e y1 = %d\n", x1, y1);

        int m = 10, n = 5;
        int c = m++ + --n;
        System.out.printf("c = %d\n", c); //14
        System.out.printf("m = %d\n", m); //11
        System.out.printf("n = %d\n", n); //4

        //Operadores Relacionais

        int idade = 30;
        boolean eAdulto = idade == 18; // Igualdade
        System.out.println(eAdulto);

        int num_a = 10;
        int num_b = 11;
        boolean saoDiferentes = (num_a != num_b); //Desigualdade/ Diferença
        System.out.println(saoDiferentes);

        double numero1 = 5.5;
        double numero2 = 3.2;
        boolean maior = numero1 > numero2; // Maior
        System.out.println(maior);

        int num_1 = 5;
        int num_2 = 3;
        boolean menor = num_1 < num_2; //Menor
        //boolean menor_igual = num_1 <= num2; //Menor ou igual
        System.out.println(menor);

        //Operadores Lógicos
        boolean temCarteira = true;
        boolean temDinheiro = false;
        boolean podeComprar = temCarteira && temDinheiro;

        System.out.println(podeComprar);

        boolean chovendo = true;
        boolean estaSol = false;
        boolean possoSair = chovendo || estaSol;

        System.out.println(possoSair);

        boolean estaFrio = true;
        boolean estaQuente = !estaFrio;
        System.out.println(estaQuente);

        //Operador Ternário
        idade = 18;
        String mensagem = (idade >=18) ? "É maior de idade" :"É menor de idade";
        System.out.println(mensagem);

    }
}
