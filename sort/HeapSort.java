import java.util.Arrays;
public class HeapSort {
    
    public static void swap(int[] array, int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void heapify(int[] array,int currentIndex,int size){
        int leftChild = (2*currentIndex)+1;
        int rightChild = (2*currentIndex)+2;
        int largest = currentIndex;
        if(leftChild < size && array[leftChild] > array[currentIndex]) {
            largest = leftChild;
        }
        if(rightChild < size && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        if(largest != currentIndex){
            swap(array, currentIndex, largest);
            heapify(array, largest, size);
        }
    }
    
    
    public static void heapBuild(int[] array){
        int size = array.length;
        int lastIndex = size-1;
        int parentIndex = (lastIndex-1)/2;
        for(int i = parentIndex; i >= 0; i--){
            heapify(array, i, size);
        }
    }
    
    public static void heapSort(int[] array){
        if(array == null || array.length < 2) 
            return;
        heapBuild(array);
        int size = array.length;
        for(int i = size - 1; i > 0; i--){
            swap(array, 0, i);
            size = size - 1;
           heapify(array, 0, size);
        }
    }
    
    public static void main(String args[]) {
        int[] array = {12, 35, 87, 26, 9, 28, 7};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
