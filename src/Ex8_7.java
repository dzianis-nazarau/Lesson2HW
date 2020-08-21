public class Ex8_7 {

//    Выводит сумму нечетных чисел от 1 до 99 включительно

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до 99 - " + sum);
    }
}
