import java.util.Arrays;
class Arrays{
    public static void main(String []args){
        int[] arr={1,3,2,4};
        int n=5;
        Arrays.sort(arr);
        for(int i=0;i<a.length;i++){
            if(a[i]!=i+1){
                missing=i+1;
                break;
            }
        }
        System.out.println("Missing No :"+Missing);     //Missing No :4
    }
} 

//Without sorting And Extra space

int[] a={1,3,2,5};
int n=5;

int expectedSum=n*(n+1)/2;

int actualSum=0;

for(int i=0;i<a.length;i++){
    actualSum+=a[i];
}
int missing=expectedSum-actualSum;
System.out.println("Missing No:"+missing);       //Missing No :4

//Using XOR Method

import java.util.Arrays;
class array{
    public static void main(String [] args){
        int[] arr={2,5,3,1};
        int n =5;
        int xor=0;
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        for(int num:arr){
            xor^=num;
        }
        System.out.print("Missing No :"+xor);     //Missing No : 4
    }
}