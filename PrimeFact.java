import java.util.Scanner;
class PrimeFact{
    public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int n=sc.nextInt();
    
    //int n=36;
    
    System.out.print("Prime factor of "+n+" are : ");  // 2 2 3 3

    while(n%2==0){
        System.out.print(2+" ");
        n=n/2;
    }

    for(int i=3;i*i<=n;i+=2){
        while(n%i==0){
            System.out.print(i+" ");
            n=n/i;
        }
    }
    if(n>1){
        System.out.print(n);
    }
}}