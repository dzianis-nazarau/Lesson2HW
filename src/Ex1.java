import java.io.IOException;
import java.util.Scanner;

//Определяет сколько в введеном числе цифр и положительное они или отрицательное

public class Ex1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("Введите число:");
            int a = scanner.nextInt();
            int aMod = Math.abs(a);
            String digitAmount;

            if (aMod < 10) {
                digitAmount = "однозначное";
            } else if (aMod < 100) {
                digitAmount = "двухзначное";
            } else {
                digitAmount = "трехзначное и более";
            }

            if (a == 0) {
                System.out.println("Введен ноль. Не положительное и не отрицательное число. Однозначное число");
            } else if (a < 0) {
                System.out.println("Введено отрицательно " + digitAmount + " число");
            } else if (a > 0) {
                System.out.println("Введено положительное " + digitAmount + " число");
            }

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");

    }
}
