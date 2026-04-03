public class PowerOfNum{
    public static void main(String [] args){

        //In build method
        double Result=Math.pow(2,5);

        //Using loop
        int base=2;
        int exp=5;
        int res=1;
        for(int i=1;i<=exp;i++){
            res=res*base;

        }

        System.out.println("Result : "+res);            //2^5=32
    }
}

