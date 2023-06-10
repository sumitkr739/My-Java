package sortingAlgorithm;
import java.util.Arrays;
import java.util.Collections;

public class inbuitcollections {
    public static void main(String[] args) {
        Integer array[]={5,4,1,3,2};
        Arrays.sort(array,0,2,Collections.reverseOrder());
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
