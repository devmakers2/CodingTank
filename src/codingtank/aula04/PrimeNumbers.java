package codingtank.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        double inputNumber = getNumberFromUser();

        List<Integer> primeNumbers = getPrimeNumbersUpUntil(inputNumber);

        Integer[] primeNumbersArray = new Integer[primeNumbers.size()];
        primeNumbers.toArray(primeNumbersArray);

        System.out.println("os números primos entre 0 e " + inputNumber + ", inclusive, são:");
        System.out.println(Arrays.deepToString(primeNumbersArray));
    }

    private static double getNumberFromUser() {
        System.out.print("por favor digite um número maior que 0: ");

        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        scanner.close();

        return inputNumber;
    }

    private static List<Integer> getPrimeNumbersUpUntil(double number) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            if (checkIsNumberPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private static boolean checkIsNumberPrime(int number) {
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }
}
