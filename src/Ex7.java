import java.io.IOException;
import java.util.Scanner;

// добавляет правильное окончание к введеному колличеству программистов

public class Ex7 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите число:");
            int a = scanner.nextInt();
            String end = "";
            String begin = "программист";

            switch (a % 10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    switch (a % 100) {
                        case 1:
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            end = "ов";
                            break;
                        default:
                            end = "a";
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    end = "ов";
                    break;
            }

            System.out.println(a + " " + begin + end);

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");

    }
}
