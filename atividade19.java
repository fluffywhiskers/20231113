package aula6;

import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor numérico: ");
        Short shortValue = sc.nextShort();
        System.out.println("Número digitado foi: " + shortValue);
        sc.close();
    }
}
