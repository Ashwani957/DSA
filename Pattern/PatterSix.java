
import java.util.Scanner;

//     public static void PrintSix() {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j <(5 - i); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//     }
// }
// Test cases ; 
public class PatterSix { 

    public static void PrintSix(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Test Cases:");
        int n = sc.nextInt();

        System.out.println("Enter the TestCases Value:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            PrintSix(num);
        }

    }
}
