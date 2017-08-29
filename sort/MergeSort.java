import java.util.Arrays;
public class MergeSort {
    
    public static void mergeSort(int[] array){
        sort(array, 0, array.length-1);
    }
    
    public static void sort(int[] array,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(array, start, mid);
            sort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }
    
    public static void merge(int[] array,int start,int mid,int end){
        int part1 = mid - start + 1;
        int part2 = end - mid;
        int[] temp1 = new int[part1];
        int[] temp2 = new int[part2];
        
        for(int i = 0; i < part1; i++) {
            temp1[i] = array[start+i];
        }
        for(int j = 0; j < part2; j++) {
            temp2[j] = array[mid+j+1];
        }
        
        int m = 0, n= 0, k = start;
        while(m < part1 && n < part2) {
            if(temp1[m] <= temp2[n]) {
                array[k] = temp1[m];
                m++;
            } else {
                array[k] = temp2[n];
                n++;
            }
            k++;
        }
        
        while(m < part1) {
            array[k] = temp1[m];
            m++;
            k++;
        }
        while(n < part2) {
            array[k] = temp2[n];
            n++;
            k++;
        }
        
    }
    
    public static void main(String args[]) {
        int[] array = {12, 35, 87, 26, 9, 28, 7};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
