package Arrays;
import java.util.*;

public class passingargument {
    public static void update(int array[]) {
        for(int i=0;i<array.length;i++){
            array[i]+=1;
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[4];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        update(array);
    }
}
