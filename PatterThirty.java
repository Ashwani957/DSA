public class PatterThirty{
    public static void printPatter(){
        int data=1 ; 
        for(int i = 0 ; i<5; i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print(data+" ");
                data++;
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
printPatter();
    }
} 