package aula6;

import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2023 - anoNascimento;

        sc.close();

        System.out.println("Sua idade é de: " + idade);
    }
}
