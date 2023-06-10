package sortingAlgorithm;
import java.util.Arrays;

public class inbuilsort {
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
