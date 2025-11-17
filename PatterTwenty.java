public class PatterTwenty {


    public static void printPatter(){
        int space=0;
        for(int i = 0 ; i<5; i++){
           
            // star
                for(int j = 0; j<5-i; j++){
                    System.out.print("*");
                }

            //space 
                for(int j = 0 ; j<space ;j++){
                    System.out.print(" ");
                }
            //star
              for(int j = 0 ; j<5-i; j++){
                    System.out.print("*");
                }
                space+=2;
                System.out.println();
        
        }
        // Reverese order 
        space=2*5-2;
        for(int i = 1 ;i<=5;i++){
            // star
            for(int j = 1; j<=i ; j++){
                System.out.print("*");
            }

            //space 
            for(int j = 0 ; j<space ;j++){
                System.out.print(" ");
            }


            //star
            
            for(int j = 1 ; j<=i ;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();



        }


    }
    public static void main (String args[]){
        printPatter();
    }
}