package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Criação do Scanner para receber inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area;

        // Ler inputs do utilizador
        System.out.print("Introduz o raio: ");
        raio = input.nextInt();

        // Calcular a área
        area = Math.PI * raio * raio;

        // Apresentar a área
        System.out.println("Área: " + area);
    }
}
