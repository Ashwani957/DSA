import java.util.Scanner;
public class SquarePatter {

    // square patter 

    public static  void printStart(int n ){
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt(); 
 printStart(n); 
         
    }
}