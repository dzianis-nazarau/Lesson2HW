public class Ex8_2 {

//    Деление клетки амебы за 24 часа

    public static void main(String[] args) {
        int j = 1;
        for (int i = 3; i < 25; i+=3) {
            System.out.println("Через " + i + " часа будет " + (j *= 2) + " клеток");
        }
    }
}
