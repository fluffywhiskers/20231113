package aula6;

import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = anoNascimento - 2023;

        sc.close();

        System.out.println("Sua idade é de: " + idade);
    }
}
