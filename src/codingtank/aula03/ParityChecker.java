package codingtank.aula03;

    public class ParityChecker {
        public static void main(String[] args) {
            System.out.println("A entrada é " + (Integer.parseInt(args[0]) % 2 == 0 ? "par." : "ímpar."));
        }
    }
