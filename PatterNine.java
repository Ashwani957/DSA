public class PatterNine {

    public static void greet() {
        // Upper pyramid
        for (int i = 0; i < 5; i++) {
            // Spaces before stars
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Spaces after stars
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Lower inverted pyramid
        for (int i = 0; i < 5; i++) {
            // Spaces before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * 5 - 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Spaces after stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        greet();
    }
}
