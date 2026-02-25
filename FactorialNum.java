
import java.util.Scanner;
public class FactorialNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num=sc.nextInt();

        //int num=5;

        long fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);    //120
   }
}