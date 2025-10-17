package arrayss;

public class ReverseInPlace {
    public static void main(String[] args){
        int arr[]={7,8,0,3,4,2,5};
        rev(arr);


    }

    public static void rev(int arr[]){
        int end=arr.length-1;
        int start=0;

        while(start<end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;


        }
       

        for(int i:arr){
            System.out.print(i +" ");
        }
        
    }
}
