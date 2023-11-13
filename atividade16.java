package aula6;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores para serem somados e divididos por 4: ");
        double value1 = sc.nextDouble();
        double value2 = sc.nextDouble();

        double result = (value1 + value2) / 4;

        System.out.println("O resultado é: " + result);
        sc.close();
    }
}
