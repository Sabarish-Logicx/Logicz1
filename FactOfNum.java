class FactOfNum{
    public static void main(String args[]){
        int num=6;

        System.out.println("Factorial Of "+num+" are:");
        for(int i=1;i<=num;i++){
            if(num %i==0){
            System.out.println(i);               // 1 2 3 6
            }                    
        }
    }
}