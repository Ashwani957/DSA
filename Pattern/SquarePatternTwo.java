import java.util.Scanner;
public class SquarePatternTwo {

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

        for(int i = 0 ; i<n ; i++){
            int num =sc.nextInt(); 
            printStart(num);
        }
         
    }
}

// we will run this for test cases :