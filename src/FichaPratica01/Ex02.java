package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, soma, subtra, multi, div;

        // Ler numero1
        System.out.print("Introduz um número: ");
        numero1 = input.nextInt();
        // Ler numero2
        System.out.print("Introduz um número: ");
        numero2 = input.nextInt();

        // Calcular a soma
        soma = numero1 + numero2;
        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Calcular a subtração
        subtra = numero1 - numero2;
        // Apresentar a subtração
        System.out.println("Subtração: " + subtra);

        // Calcular a multiplicação
        multi = numero1 * numero2;
        // Apresentar a multiplicação
        System.out.println("Multiplicação: " + multi);

        // Calcular a divisão
        div = numero1 / numero2;
        // Apresentar a divisão
        System.out.println("Divisão: " + div);

        // 2º método de resolver o problema usando somente 3 variáveis

        // Declarar variáveis
        int num1, num2, resultado;

        System.out.print("Diz-me o 1º número: ");
        num1 = input.nextInt();

        System.out.print("Diz-me o 2º número: ");
        num2 = input.nextInt();

        // Calcular soma
        resultado = num1 + num2;

        // Apresentar a soma
        System.out.println("Soma: " + resultado);

        // Calcular a subtração
        resultado = num1 - num2;

        // Apresentar a subtração
        System.out.println("Subtração: " + resultado);

        // Calcular a multiplicação
        resultado = num1 * num2;

        // Apresentar a multiplicação
        System.out.println("Multiplicação: " + resultado);

        // Calcular a divisão
        resultado = num1 / num2;

        // Apresentar a divisão
        System.out.println("Divisão: " + resultado);


    }
}
