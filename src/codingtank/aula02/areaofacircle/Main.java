package codingtank.aula02.areaofacircle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.print("raio do círculo: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.format("a área do círculo é de %.2e", circle.getArea());
    }
}
