package problem.sort.integer.quick;

public class QuickSort {

    public void quickSort(int[] array, int left, int right) {
        if(left >= right) return;
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");



        // 분할
        int pivot = partition(array, left, right);

        quickSort(array, left, pivot-1);
        quickSort(array, pivot+1, right);
    }

    public int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left, j = right;

        while(i < j) {
            while (pivot < array[j]) {
                j--;
            }
            while(i < j && pivot >= array[i]) {
                i++;
            }
            swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;

        return i;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
