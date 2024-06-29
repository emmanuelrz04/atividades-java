package test;

import java.util.Scanner;

public class interroga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pergunta = 0;
        int resposta;

        System.out.println("Responda com 1 para 'sim' ou 2 para 'não' às seguintes perguntas:");

        System.out.print("Telefonou para a vítima? ");
        resposta = input.nextInt();
        if (resposta == 1) {
            pergunta++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = input.nextInt();
        if (resposta == 1) {
            pergunta++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = input.nextInt();
        if (resposta == 1) {
            pergunta++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = input.nextInt();
        if (resposta == 1) {
            pergunta++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = input.nextInt();
        if (resposta == 1) {
            pergunta++;
        }

        if (pergunta == 5) {
            System.out.println("Classificação: Assassino");
        } else if (pergunta >= 3) {
            System.out.println("Classificação: Cúmplice");
        } else if (pergunta == 2) {
            System.out.println("Classificação: Suspeita");
        } else {
            System.out.println("Classificação: Inocente");
        }

        input.close();
    }
}
