import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.nextLine();

        try {
            contar(parametroUm, parametroDois, terminal);
        } catch (ParametrosInvalidosException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O SEGUNDO parâmetro deve ser maior que o PRIMEIRO.");
        }
    }

    static void contar(int parametroUm, int parametroDois, Scanner terminal) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= parametroUm; i++) {
            System.out.println("Imprimindo o número " + i);
            System.out.println("\nPressione ENTER para continuar...");
            terminal.nextLine();
        }

        System.out.println("\nO primeiro número escolhido é " + parametroUm + "\n");

        for (int i = 1; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
            System.out.println("\nPressione ENTER para continuar...");
            terminal.nextLine();
        }

        System.out.println("\nO segundo número escolhido é " + parametroDois + "\n");

        System.out.println("Resultado: " + contagem);
    }
}
