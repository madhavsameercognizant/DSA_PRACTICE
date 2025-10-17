import java.util.Scanner;

public class Calculator{

    public static void main(String []args){
     Scanner  sc=new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        int givenvalue=sc.nextInt();
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");

        int b=sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;

        switch (givenvalue) {
            case 1:
            System.out.println("The sum of the given number is "+sum);
                break;
            
            case 2:
            System.out.println("The difference of given numbers is "+diff);
                break;
            
            case 3:
            System.out.println("The multiplication of given numbers is "+mul);
                break;

            case 4:
            System.out.println("The division of given numbers is "+div);
                break;

        
            default:
            System.out.print("Invalid input");
                break;
        }





    }
     
     
   
    

}