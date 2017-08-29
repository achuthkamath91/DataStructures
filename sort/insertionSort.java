import java.util.Arrays;
public class MyClass {
    
    public static void swap(int[] array, int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void insertionSort(int[] array){
        int length = array.length;
        if(array == null && length< 2){
            return ;
        }
        
        for(int i=1;i<length;i++){
            int temp = array[i];
            int j = i-1;
            while(j>=0 && temp<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        
    }
    
    public static void main(String args[]) {
        int[] array = {1,4,8,3,5,2,1};
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
