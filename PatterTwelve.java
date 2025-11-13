public class PatterTwelve {

    public static void PrintPatter(){

        // outter loop 
        for(int i = 0 ; i<5 ; i++){

            // print 
            for(int j = 0 ; j<=i; j++){
                System.out.print(j+1);
            }

            // space 
            for(int j = 0 ; j<2*5-2*i-2 ; j++){
                System.out.print(" ");
            }


            // print 
             for(int j=i ; j>=0; j--){
                System.out.print(j+1);
            }
            

            System.out.println();
        }

    }
    public static void main (String args[]){

        PrintPatter();

    }
}