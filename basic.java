import java.util.Scanner;

public class basic {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=sc.nextInt();
        EvenOdd(n);


        }

    public static void EvenOdd(int n){
        System.out.println("Even numbers are: ");
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+" ");
                
            }
        }
        System.out.println();
        System.out.println("Odd numbers are: ");
        for(int i=1; i<=n; i++){
            if(i%2!=0){
               System.out.print(i+" ");
            }
        }
        System.out.println();

    }
}