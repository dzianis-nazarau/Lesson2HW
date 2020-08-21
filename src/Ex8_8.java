public class Ex8_8 {

/*    Рисует два треугольника:
   *
  **
 ***
****

и

****
 ***
  **
   *
 */

    public static void main(String[] args) {

        System.out.println("Первый треугольник:");

        int index = 4;
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {

                if (j >= index) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            index--;
            System.out.print("\n");
        }

        System.out.println("\nВторой треугольник:");

        int index2 = 1;
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j < 5; j++) {

                if (j >= index2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            index2++;
            System.out.print("\n");
        }
    }
}
