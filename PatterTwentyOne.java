// public class PatterTwentyOne{


// public static void printPatter(){


//     int space = 8 ; 
//     for(int i=0; i<5; i++){

//         // star
//         for(int j = 0 ; j<=i; j++){
//             System.out.print("*");
//         }
        
//         //space 

//         for(int j = 0 ; j<space ;j++){
//             System.out.print(" ");
//         }

//         // start 
//         for(int j = 0 ; j<=i; j++){
//             System.out.print("*");
//         }
//         space-=2; 
//         System.out.println();
        
//     }

//     // for bottom portion 

//     space=2 ; 
//     for(int i = 0 ; i<4 ; i++){
//         // star
//         for(int j = 0 ; j<4-i ; j++){
//             System.out.print("*");
//         }

//         // space 
//         for(int j=0 ; j<space ; j++){
//             System.out.print(" ");
//         }

//         // star
//         for(int j = 0 ; j<4-i ; j++){
//             System.out.print("*");
//         }
//         space+=2; 
//         System.out.println();



//     }




// }

//     public static void main (String args[]){

//         printPatter(); 
//     }
// }



// code by video 


public class PatterTwentyOne{

    public static void printPatter(int n ){
        int space=2*n-2;// 8 
        for(int i = 1 ; i<=2*n-1; i++){
            int star=i ; 
            if(i>n) star=2*n-i;
            // star 
            for(int j = 1 ; j<=star; j++){
                System.out.print("*");
            }
            // space t
            for(int j = 1 ; j<=space ; j++){
                System.out.print(" ");
            }

            // star 
              for(int j = 1 ; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2; 
            else space+=2; 


            
        }

    }
    public static void main (String args[]){

        printPatter(5);
    }
}