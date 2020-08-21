import java.io.IOException;
import java.util.Scanner;

// Умножение целых чисел без использования *

public class Ex8_4 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите числа:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int mul = 0;
            int headMnog;
            int mnog;

            if ((a < 0 & b > 0) || (a > 0 & b < 0)) {
                if (a < 0) {
                    headMnog = a;
                    mnog = b;
                } else {
                    headMnog = b;
                    mnog = a;
                }
            } else {
                headMnog = a;
                mnog = b;
            }

            for (int i = 0; i < Math.abs(mnog); i++) {
                mul += headMnog;
            }

            System.out.println("их произведение равно: " + mul);

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");


    }
}
