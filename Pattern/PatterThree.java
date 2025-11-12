
import java.util.Scanner;
// public class PatterThree {

//     // print isoscle traingel 
//     public  static void printIsocelesTraingle() {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String args[]) {
//         printIsocelesTraingle();
//     }
// }
// Example 2 
public class PatterThree {

    // print isoscle traingel 
    public static void printIsocelesTraingle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // this n will tell about the test cases 

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            printIsocelesTraingle(num);
        }
    }
}
