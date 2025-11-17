
import java.util.Arrays;
public class CombineTwoSortedArray{
    public static int[]  printPatter(int arrOne[], int arrTwo[],int arrThree[],int n , int m ){
        int i = 0 , j = 0 , k = 0 ; 

        // while loop 
        while (i<n && j<m){
            if(arrOne[i]<arrTwo[j]){
                arrThree[k++]=arrOne[i++];

            }
            else {
                arrThree[k++]=arrTwo[j++];
            }
        }
        // Second while loop to that are run one array having less lenght then other array 

        // below this two codntion will render only when any array have different in length  
        while (i<n){
            arrThree[k++]=arrOne[i++];
        }

    //  

        while(j<m){
            arrThree[k++]=arrTwo[j++];
        }

        return arrThree;
    }


    public static void main (String args[]){

        int arrOne[]={1,2,5,9};
        int arrTwo[]={3,4,5,6,8};
        int arrThree[]=new int [arrTwo.length+arrOne.length];
  int result []=printPatter(arrOne, arrTwo,arrThree,arrOne.length, arrTwo.length);
 
System.out.println(Arrays.toString(result));
 

    }
}