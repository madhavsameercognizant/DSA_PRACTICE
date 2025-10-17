package arrayss;

public class CheckIfSorted {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,11,87};
        System.out.println(check(arr));
        
    }

    public static boolean check(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            if(arr[j]<arr[i]){
                return false;
            }

        }

        return true;

    }
}
