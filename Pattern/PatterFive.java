
import java.util.Scanner;
// public class PatterFive {
//     public static void printPatter(){
//         for(int i = 0 ;i<5 ; i++){
//             for (int j = 0 ; j<=i; j++){
//                 System.out.print(i+1);
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
// printPatter(); 
//     }
// }

// test cases : 2 , for 4 , 6 
public class PatterFive {

    public static void printPatter(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Test Cases:");
        int n = sc.nextInt();
        System.out.println("Enter the Test Cases vale:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            printPatter(num);
        }
    }
}
