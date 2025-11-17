public class Patterthirtytwo{

    public static void printPatter(int n ){
        // outter loop 
        for(int i = 0 ; i<n ; i++){
             for(int j = 0 ;j<n ; j++){
                 if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("4");
                 }
                 else if (i==1 || i==n-2 || j==1 || j==n-2){
                    System.out.print("3");
                 }
                 else if (i==2 || i==n-3 || j==2 || j==n-3){
                    System.out.print("2");
                 }

             }
             System.out.println();
        }
    }

    public static void main (String args[]){
printPatter(7);
    }
}