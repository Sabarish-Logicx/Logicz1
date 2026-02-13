class PalindromeNum{
public static void main(String[]args){
int num=121;
int org=num;
int rev=0;

while(num>0){
    int dig=num%10;
    rev=rev*10+dig;
    num=num/10;
}

if(org==rev){
    System.out.println("Yes");
}else{
    System.out.println("No");
}
}
}
