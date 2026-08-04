import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pede senha ou código? (sim/não)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Mensagem suspeita ");

        } else {
            System.out.println("Mensagem provavelmente legitima ");

            }
        }
    }