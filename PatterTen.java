public class PatterTen{

    public static  void printPatter ( int number){

        for(int i = 0 ; i<=number; i++){
            for(int j = 0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
        
        for(int i = 0 ; i<number-1; i++){
            for(int j = 0 ; j<number-i-1;j++){
                System.out.print("*");
            }
            System.out.println(); 

        }

    }
    public static void main (String args[]){
        printPatter(5);
    
    }
}