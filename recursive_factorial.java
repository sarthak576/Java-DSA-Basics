import java.util.Scanner;
public class recursive_factorial{
     public static int factorial(int n){

        if(n>=0){
            if(n==0||n==1){
                return 1;
            }
            else{
                return n*factorial(n-1);
            }
        }
        else{
            System.out.println("invalid number ");
           return 0;
        }
}


    public static void main(String [] args){
        System.out.println("Type any number:- ");
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      System.out.println("Factorial of "+number+" is "+factorial(number));

    }
}