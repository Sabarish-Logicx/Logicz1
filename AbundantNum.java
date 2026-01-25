class AbundantNum{
    public static void main(String[] args){

        //int num=12;                             Possible Divisior for 12 -> 1+2+3+4+6 = sum(16)>(num)12 
        int sum=0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println(num+" is Abundant Number");
        }else{
         System.out.println(num+" is not Abundant Number");   
        }
    }
}