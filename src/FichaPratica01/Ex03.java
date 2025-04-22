package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, area;

        // Ler 1º número
        System.out.print("Introduz o 1º número: ");
        num1 = input.nextInt();

        // Ler 2º número
        System.out.print("Introduz o 2º número: ");
        num2 = input.nextInt();

        // Calcular a área
        area = num1 * num2;

        // Apresentar a área
        System.out.println("Área: " + area);

    }
}
