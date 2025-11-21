public class StockBuySell{

    public static int  stockBuySell(int arr[]){
        int buy_price=arr[0];
        int current_profit=0;
    int max_profit=0;

    for(int i = 0 ; i<arr.length; i++){


        if(i+1<arr.length){
        if(arr[i]>arr[i+1]){
            buy_price=arr[i+1];
        }
        else  {
            current_profit=arr[i+1]-buy_price;
            max_profit=Math.max(max_profit,current_profit);
        }
        }
 
     
    }
    return max_profit;

}
    public static void main (String args[]){
        int arr[]={7,2,4,5,1,3,6,4};
        int ans=stockBuySell(arr);
        System.out.println(ans);
    }
}