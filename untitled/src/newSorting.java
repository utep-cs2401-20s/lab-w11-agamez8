public class newSorting {

    //helps the array sort during quicksort
    public int sort(int[] array, int start, int end){
        int pivot = array[start];
        int partition = start + 1;
        for (int i = start + 1; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[partition];
                array[partition] = array[i];
                array[i] = temp;
            }
            partition++;
        }
        array[start] = array[partition - 1];
        array[partition - 1] = pivot;
        return partition - 1;
    }

    //recrusive quickSort method
    public void quickSort(int[] array, int start, int end){
        if(start < end){
            int partition = sort(array, start, end);
            quickSort(array, start, partition - 1);
            quickSort(array, partition + 1, end);
        }
    }

    //sorts an array
    public void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    public void merge(int[] array, int[] LH, int[] RH){
        int left = 0;
        int right = 0;
        int index;
        while(left < array.length && right < array.length){
            for(index = 0; index < array.length - 1; index++){
                if(LH[left] < RH[right]){
                    array[index] = LH[left];
                    left++;
                }
                if(LH[left] > RH[right]){
                    array[index] = RH[right];
                    right++;
                }
            }
        }
    }

    public void newSorting(int[] array, int size){
        if(array.length <= size){
            quickSort(array);
        }
        else{
            int mid = array.length / 2;
            int[] LH = new int[mid];
            int[] RH = new int[array.length - mid];
            for(int i = 0; i < LH.length; i++){
                LH[i] = array[i];
            }
            for(int i = 0; i < RH.length; i++){
                RH[i] = array[ i + mid];
            }
            newSorting(LH, size);
            newSorting(RH, size);
            merge(array, LH, RH);
        }
    }

}
