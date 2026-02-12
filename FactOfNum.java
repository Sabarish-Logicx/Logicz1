import java.util.Scanner;
class FactOfNum{
    public static void main(String args[]){
        //int num=6;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Num : ");
        int num=sc.nextInt();

        int sum=0;
       
        System.out.println("Factorial Of "+num+" are : ");
        for(int i=1;i<=num;i++){
            if(num %i==0){
            System.out.println(i);         // 1 2 3 6
            sum =sum+i;               
            }                    
        }
    System.out.println("Addition of Fact are : "+sum);      //12
    }

}