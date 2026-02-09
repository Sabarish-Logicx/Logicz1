class PrimeFact{
    public static void main(String [] args)
{
    int a=55;
    System.out.println("Prime factor of"+n+"are :");

    while(n%2==0){
        System.out.print(2+" ");
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