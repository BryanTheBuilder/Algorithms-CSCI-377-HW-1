import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] arr = {12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1};

    int[] arr1 = {12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12, 11, 13, 0, 6, 7, 22, 3, 9, 1, 12,
        11, 13, 0,
        6, 7, 22, 3, 9, 1};

    System.out.println("unsorted array 1: " + Arrays.toString(arr));
    System.out.println("unsorted array 2: " + Arrays.toString(arr1));
    long insertionStartTime = System.nanoTime();
    insertionSort(arr);
    double insertionElapsedTime = (System.nanoTime() - insertionStartTime) / 1000000.0;
    System.out.println("Insertion Sorted Array: " + Arrays.toString(arr));
    System.out.printf("Total execution time for insertion sort is %.2f ms\n", insertionElapsedTime);
    long mergeStartTime = System.nanoTime();
    mergeSort(arr1, 0, arr1.length - 1);
    double mergeElapsedTime = (System.nanoTime() - mergeStartTime) / 1000000.0;
    System.out.println("Merge Sorted Array: " + Arrays.toString(arr1));
    System.out.printf("Total execution time for merge sort is %.2f ms\n", mergeElapsedTime);
  }

  private static void mergeSort(int arr[], int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;

      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);

      merge(arr, left, mid, right);
    }
  }

  private static void merge(int arr[], int left, int mid, int right) {
    int n1 = mid + 1 - left;
    int n2 = right - mid;

    int[] leftArr = new int[n1 + 1];
    int[] rightArr = new int[n2 + 1];

    for (int i = 0; i < n1; i++) {
      leftArr[i] = arr[left + i];
    }
    for (int j = 0; j < n2; j++) {
      rightArr[j] = arr[mid + 1 + j];
    }

    leftArr[n1] = Integer.MAX_VALUE;
    rightArr[n2] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;

    for (int k = left; k <= right; k++) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
    }
  }

  private static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
    return arr;
  }
}
