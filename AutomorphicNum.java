
import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {

        //int n = 25;                            25*25=625,6*6=36  ends with 5,6
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n=sc.nextInt();
        int square = n * n;

        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic)
            System.out.println(n+" is Automorphic Number");
        else
            System.out.println(n+" is Not an Automorphic Number");
    }
}

//In-build Method

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
    }

        return squareStr.endsWith(numStr);