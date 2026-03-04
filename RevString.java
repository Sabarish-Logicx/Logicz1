class RevString{
public static void main(String[] args){
    String str="SABARISH";
    char[] arr=str.toCharArray();

    int start=0;
    int end =arr.length-1;

    while(start<end){
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
    }
    for(char ch:arr){
        //System.out.print(new String(arr));    // HSIRABAS
        System.out.print(ch+" ");              // H S I R A B A S
    }
    }
}
