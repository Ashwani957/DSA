public class PatterNinghteen {


    public static void printPatter(){
        
        for(int i=0 ; i<5; i++){
            
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
         
    }

   
    public static void main (String args[]){
printPatter();
    }
}