package Strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");

        //Strings are IMUTTABLE

        Scanner sc=new Scanner(System.in);
        String name;
        //name=sc.next();

        //.next take only word

        //System.out.println(name);

        //to print full name use .nextLine()

        // name=sc.nextLine();
        // System.out.println(name);

        //to check length of string use StringName.length

        // System.out.println(name.length());

        //String Concatenation

        String firstName="Sumit";
        String lastName="Sinha";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));

    }
}
