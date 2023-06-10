package Arrays;
//linear search
public class searchelement {
    public static int linearSearch(int array[],int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i; 
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int array[]={10,20,30,40,50,60};
        int key=30;
        System.out.println(linearSearch(array,key));
    }
}
