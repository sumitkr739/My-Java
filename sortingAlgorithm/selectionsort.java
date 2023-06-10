package sortingAlgorithm;

public class selectionsort {
    public static void selectionSort(int array[]) {
        for(int i=0;i<array.length;i++){
            int minPos=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPos]<array[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[]={64, 25, 12, 22, 11};
        selectionSort(array);
    }
}