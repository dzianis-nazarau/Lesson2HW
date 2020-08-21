import java.io.IOException;
import java.util.Scanner;

// Прибавляет к положительному числу 1, из отрицательного отнимает 2 и если 0 - выводит 10

public class Ex3 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите число:");
            int a = scanner.nextInt();

            if (a == 0) {
                a = 10;
            } else if (a < 0) {
                a -= 2;
            } else if (a > 0) {
                a++;
            }

            System.out.println("После преобразования получено: " + a);

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");

    }
}
