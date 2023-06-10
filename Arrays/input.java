package Arrays;
import java.util.*;

public class input {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        marks[0]+=1;
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);

        System.out.println("Length of array:"+ marks.length);
    }
}
