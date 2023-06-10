package Arrays;

public class binarysearch {
    public static int binarySearch(int array[],int key) {
        int start=0;
        int end=array.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(array[mid]==key){
            return mid;
        }
        if(array[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
}
return -1;
    }
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,60};
        int key=70;
        System.out.println(binarySearch(array,key));
    }
}

