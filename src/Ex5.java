import java.util.Scanner;

//Нахлодит количество положительных и отрицательных чисел среди введеных

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pol = 0;
        int otr = 0;

        System.out.println("Введите три числа:");
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            if (a > 0) {
                pol++;
            } else if (a < 0) {
                otr++;
            }
        }

        System.out.println("Количество положительных чисел, среди введеных, равно - " + pol + "\n" + "Количество отрицательных чисел, среди введеных, равно - " + otr);

    }

}
