/*
 * enunciado:
 * Calcule a média aritmética de n valores a digitados.
 *
 * O programa deve pedir ao usuário para digitar uma nota de 0 a 10.
 * Caso o usuário informe o valor -1, o programa deve calcular e exibir
 * a média, além de informar a quantidade de notas digitadas.
 *
 * extra:
 * Caso o usuário informe um valor maior do que 10, o programa deve
 * exibir uma mensagem informando que é um valor inválido.
 * Tal valor não deve ser considerado para o cálculo da média.
 *
 */

package codingtank.aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        double sum = 0;
        int numberOfGrades = 0;

        while (true) {
            double value = getGradeFromUser();

            boolean shouldExit = checkIfShouldExit(value);
            if (shouldExit) {
                break;
            }

            boolean isValueIsAnInvalidGrade = checkIfValueIsAnInvalidGrade(value);
            if (isValueIsAnInvalidGrade) {
                System.out.println("Nota inválida. A nota não pode ser maior que 10.");
                continue;
            }

            numberOfGrades++;
            sum += value;
        }

        System.out.format("a média da(s) %d nota(s) válida(s) é: %.2f", numberOfGrades, sum/numberOfGrades);
    }

    private static double getGradeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("por favor digite uma nota: ");

        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("por favor digite uma nota no formato xx,x, onde x é um dígito numérico");
            return getGradeFromUser();
        }
    }

    private static boolean checkIfShouldExit(double value) {
        return value == -1;
    }

    private static boolean checkIfValueIsAnInvalidGrade(double value) {
        return value > 10;
    }
}
