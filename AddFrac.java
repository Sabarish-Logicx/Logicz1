
class AddFrac{
    public static void main (String[] args){
        int num1=1,den1=2;
        int num2=3,den2=4;

        int numerator=num1*den2+num2*den1;
        int denominator=den1*den2;

        int gcd=findGCD(numerator,denominator);

        System.out.println("sum = "+(numerator/gcd)+"/"+(denominator/gcd));     //sum = 10/8
    }
    static ont findGCD(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
     
       }
       return a;
    }
    }
    

