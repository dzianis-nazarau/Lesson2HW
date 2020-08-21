public class Ex8_3 {

//    Вычисляет 1+2+4+8+...+256

    public static void main(String[] args) {

        int sum = 0;
        int j = 1;
        while (j < 256) {
            sum += (j *= 2);
        }
        System.out.println(sum);
    }
}
