package arrayss;
import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }


        
        int res[]=maxmin(arr);
        System.out.println("Max element: "+res[0]);
        System.out.println("Min element: "+res[1]);



        
        

    }

    public static int[] maxmin(int arr[]){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int res[]=new int[2];

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            

          
        }
        res[0]=max;
        res[1]=min;
        return res;
    }
    
}
