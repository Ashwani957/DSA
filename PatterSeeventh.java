// public class PatterSeeventh{
//     public static void printPatter(){
//         char ch='A';
//         for(int i = 0 ; i<5 ; i++){
//             for(int j = 0 ; j<=i; j++){
//                 System.out.print(ch);   
//             }
//            ch++;
//             System.out.println();
//         }

//     }
//     public static void main (String args[]){
//         printPatter();




//     }
// }



public class PatterSeeventh{
    public static void printPatter(){
        for(int i = 0 ; i<6 ; i++){
            char ch=(char)('A'+i);

            for(int j = 0 ; j<=i; j++){
                System.out.print(ch);   
            }
           ch++;
            System.out.println();
        }

    }
    public static void main (String args[]){
        printPatter();


        char chtow='A'+1;
        // System.out.println("print::"+chtow);
//    System.out.println((int) chtow);


    }
}