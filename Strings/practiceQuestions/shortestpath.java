package Strings.practiceQuestions;
import java.util.Scanner;
public class shortestpath {
    public static float shortestPath(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            //north
            if(dir=='n'){
                y++;
            }
            //south
            else if(dir=='s'){
                y--;
            }
            //west
            else if(dir=='w'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(shortestPath(str));
    }
}
