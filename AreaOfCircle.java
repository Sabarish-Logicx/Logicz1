import java.util.Scanner;
class AreaOfCircle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Radius :");
        double r=sc.nextDouble();
        //double r=3;

        double sum=3.14*r*r;

        System.out.println("Area Of Circle is "+sum);
    }
}