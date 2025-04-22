package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Criação do Scanner para receber inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area1, area2;

        // Ler inputs do utilizador
        System.out.print("Introduz o raio: ");
        raio = input.nextInt();

        // Calcular a área
        area1 = Math.PI * raio * raio;
        area2 = Math.PI * Math.pow(raio,2);

        // Apresentar a área
        System.out.println("Área: " + area1);
        System.out.println("Área: " + area2);
        System.out.println(Math.pow(2,3));
    }
}
