public class SumOfDigits{
    public static void main(String[] args){
   /*     int num=22;

        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
            }
            System.out.println("Sum of Digits = "+sum);      // 4
    }
}*/

//Sum of digit until single digit remains
int num=9875;

while(num>=10){
    int sum=0;
while(num!=0){
    sum=sum+(num%10);
    num=num/10;
}
num=sum;
}
System.out.print(+num);
}
}

