package codingtank.aula03;

    import java.util.Locale;
    import java.util.Scanner;

    public class Sum {
        public static void main(String[] args){
            Locale.setDefault(new Locale("pt", "BR"));

            double number1, number2;
            switch (args.length) {
                case 0:
                    number1 = getNumberFromUser();
                    number2 = getNumberFromUser();
                    break;
                case 1:
                    number1 = Double.parseDouble(args[0]);
                    number2 = getNumberFromUser();
                    break;
                case 2:
                    number1 = Double.parseDouble(args[0]);
                    number2 = Double.parseDouble(args[1]);
                    break;
                default:
                    System.err.println("erro: quantidade inválida de números de entrada");
                    return;
            }

            System.out.format("a soma de %,.2f e %,.2f é: %,.2f", number1, number2, number1 + number2);
        }

        private static double getNumberFromUser() {
            System.out.print("por favor, digite um número: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        }
    }
