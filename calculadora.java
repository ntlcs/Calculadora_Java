import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Porcentagem");
        System.out.print("Digite sua escolha: ");
        int escolha = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        double num2;
        if (escolha != 5) {
            System.out.print("Digite o segundo número: ");
            num2 = input.nextDouble();
        } else {
            System.out.print("Informe o %: ");
            num2 = input.nextDouble();
        }

        double resultado = 0.0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero");
                    return;
                }
                resultado = num1 / num2;
                break;
            case 5:
                resultado = (num1 * num2) / 100;
                break;
            default:
                System.out.println("Escolha inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}

