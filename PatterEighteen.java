// public class PatterEighteen{
//     public static void printPatter(){
//         for(int i =0 ; i<4 ; i++){
//             //space print 
//             for(int j = 0 ;j<(4-i-1);j++){
//                 System.out.print("*");
//             }


//             for (char ch='A';ch<='A'+i;ch++){
//                 System.out.print(ch);
//             }

//             // reverse order 
//             for(char ch=(char)('A'+i-1);ch>='A';ch--){
//                 System.out.print(ch);
//             }


//             // space print 
//                 for(int j = 0 ;j<(4-i-1);j++){
//                 System.out.print("*");
//             }
//             System.out.println( );

//         }
//     }
//     public static void main (String args[]){
//         printPatter();

//     }
// }


public class PatterEighteen{
    public static void printPatter(){
        for(int i =0 ; i<4 ; i++){
            //space print 
           
             for(int j = 0 ;j<(4-i-1);j++){
                System.out.print("*");
            }
            char ch='A';

            int breakpoint=(2*i+1)/2;

            for(int j = 1; j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }

            }
            

             for(int j = 0 ;j<(4-i-1);j++){
                System.out.print("*");
            }
        }
    }
    public static void main (String args[]){
        printPatter();

    }
}