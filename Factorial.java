import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " :- " + factorial(num));
    }

    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        else{
            for(int i=num-1; i>0; i--){
                num = num * i;
            }
        }
        return num;
    }
}