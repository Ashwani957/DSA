// public class PatterFifteen {
//     public static void printPatter(int n ){
//         for(int i = n ; i>=0 ; i--){
//             for(char ch='A'; ch<='A'+i;ch++){
//                 System.out.print(ch+"");
//             } 
//             System.out.println();
//         }
//     }
//     public static void main (String args[]){
// printPatter(5);
//     }
// }



public class PatterFifteen {
    public static void printPatter(int n ){
        for(int i = 0 ; i<n ; i++){
            for(char ch='A'; ch<='A'+(n-i-1);ch++){
                System.out.print(ch+"");
            } 
            System.out.println();
        }
    }
    public static void main (String args[]){
printPatter(5);
    }
}