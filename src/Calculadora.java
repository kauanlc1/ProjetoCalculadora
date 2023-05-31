import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Usei try-with-resources para fechar o Scanner automaticamente
            double resultado = 0;

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();

            switch (operacao) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            System.out.println("Resultado: " + resultado);
        }
    }
}
