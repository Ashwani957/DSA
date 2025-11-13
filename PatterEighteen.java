public class PatterEighteen{
    public static void printPatter(){
        for(int i =0 ; i<4 ; i++){
            //space print 
            for(int j = 0 ;j<(4-i-1);j++){
                System.out.print("*");
            }


            for (char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }

            // reverse order 
            for(char ch=(char)('A'+i-1);ch>='A';ch--){
                System.out.print(ch);
            }


            // space print 
                for(int j = 0 ;j<(4-i-1);j++){
                System.out.print("*");
            }
            System.out.println( );

        }
    }
    public static void main (String args[]){
        printPatter();

    }
}