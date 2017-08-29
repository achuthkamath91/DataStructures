/**
* Bubble sort using simple java
*
**/

import java.util.Arrays;
public class MyClass {
    
    public static void bubbleSort(int[] array){
        int length = array.length;
        if(array == null && length <2){
            return ;
        }
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i=1; i<length; i++){
                if(array[i-1]>array[i]){
                    swap(array,i-1,i);
                    swapped = true;
                }
            }
            length --;
        }        
    }
    
    public static void swap(int[] array, int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String args[]) {
        int[] array = {1,1,4,8,3,5,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
