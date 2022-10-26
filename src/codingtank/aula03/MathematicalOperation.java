package codingtank.aula03;

    import java.util.Scanner;

    public class MathematicalOperation {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite o primeiro operando: ");
            double number1 = scanner.nextDouble();

            System.out.print("digite o segundo operando: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("escolha uma operação (as opções são +, -, /, *): ");
            String operation = scanner.nextLine();

            double result;

            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                default:
                    System.err.println("opção inválida");
                    return;
            }

            System.out.println("----------");
            System.out.format("%,f %s %,f = %,f", number1, operation, number2, result);
        }
    }
