package Arrays;

public class reversearray {
    public static void reverseArray(int array[]) {
        int n=array.length-1;
        int start=0;
        int end=n;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp; 

            start++;
            end--;       
    }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int array[]={10,20,30,40,50};
        reverseArray(array);
    }
}
