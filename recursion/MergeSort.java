
public class MergeSort {

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeArr(int arr[], int low, int mid, int high) {
        int tempArr[] = new int[high-low+1];
        int left = low, right = mid + 1, ptr = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tempArr[ptr] = arr[left];
                left++;
                ptr++;
            } else {
                tempArr[ptr] = arr[right];
                ptr++;
                right++;
            }

        }
        while (left <= mid) {
            tempArr[ptr] = arr[left];
            left++;
            ptr++;
        }
        while (right <= high) {
            tempArr[ptr] = arr[right];
            right++;
            ptr++;
        }
        for (int i = 0; i < tempArr.length; i++) {

            arr[i+low] = tempArr[i ];
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            mergeArr(arr, low, mid, high);
        }


    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 3, 1, 9, 0, 4, 5, 6 };
        System.out.println("Array Before Sorting : ");
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting : ");
        printArr(arr);
    }

}
