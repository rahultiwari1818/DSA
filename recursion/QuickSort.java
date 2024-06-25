public class QuickSort {
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i=low,j=high;
        while(i<j){
            while(arr[i] <= pivot && i <= high-1){
                i++;
            }
            while(arr[j] > pivot && j >= low+1){
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }


    public static void quickSort(int arr[],int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 3, 1, 9, 0, 4, 5, 6 };
        System.out.println("Array Before Sorting : ");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting : ");
        printArr(arr);
    }

}
