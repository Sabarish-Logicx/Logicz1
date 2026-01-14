import java.util.Scanner;
class ArmNum{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();

        int original=num;
        int sum=0;

        //count digit
        int digits=String.valueOf(num).length();
        

        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num/=10;
        }

        if(sum==original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        }

}