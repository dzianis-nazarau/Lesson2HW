import java.io.IOException;
import java.util.Scanner;

//Определяет существует ли треугольник с задаными сторонами или нет

public class Ex2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        char answer;

        do {

            System.out.println("Введите сторону a:");
            int a = scanner.nextInt();
            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();
            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            if (a > b + c || b > a + c || c > a + b) {
                System.out.println("Треугольник не существует");
            } else {
                System.out.println("Треугольник существует");
            }

            System.out.println("Еще? y/n");
            answer = (char) System.in.read();

        } while (answer == 'y');

        System.out.println("Мы закончили");

    }
}
