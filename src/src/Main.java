package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pede senha ou código? (sim/não)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita.");
            return;
        }

        System.out.println("Falta alguma informação? (sim/não)");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita.");
            return;
        }

        System.out.println("Possui um link com erro de digitação? (sim/não)");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita.");
            return;
        }

        System.out.println("Contato desconhecido pedindo dinheiro? (sim/não)");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita.");
            return;
        }

        System.out.println("Tem algum caractere diferente? (sim/não)");
        resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita.");
            return;
        }

        System.out.println("Mensagem provavelmente legítima.");

        scanner.close();
    }
}