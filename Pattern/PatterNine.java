
public class PatterNine {

    public static void printPatter() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < (2 * 5 - 2 * i - 1); j++) {
                System.out.print("*");

            }

            for (int j = 0; i < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printPatter();
    }
}
