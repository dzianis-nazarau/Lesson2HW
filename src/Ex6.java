import java.io.IOException;
import java.util.Scanner;

// Выыодит большее число из двух

public class Ex6 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите два числа:");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();

            if (a == b) {
                System.out.println("Числа равны");
            } else if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");

    }
}
