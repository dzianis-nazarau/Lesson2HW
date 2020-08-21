import java.util.Scanner;

//Нахлодит количество положительныч чисел среди введеных

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int j = 0;
        System.out.println("Введите три числа:");
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() > 0) {
                j++;
            }
        }

        System.out.println("Количество положительных чисел, среди введеных, равно - " + j);

    }
}
