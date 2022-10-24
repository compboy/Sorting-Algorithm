public class App {
    static void MergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            MergeSort(array, left, mid);
            MergeSort(array, mid + 1, right);
            Merge(array, left, mid, right);
        }
    }

    static void Merge(int[] array, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int LeftArray[] = new int[len1];
        int RightArray[] = new int[len2];

        for (int i = 0; i < len1; i++)
            LeftArray[i] = array[left + i];

        for (int j = 0; j < len2; j++)
            RightArray[j] = array[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;

        while (i < len1 && j < len2) {
            if (LeftArray[i] <= RightArray[j]) {
                array[k] = LeftArray[i];
                i++;
            } else {
                array[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            array[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < len2) {
            array[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[] array = { 80, 60, 10, 30, 50, 20, 40, 100, 90, 70 };
        System.out.println("Unsorted Array:");
        PrintArray(array);
        MergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array:");
        PrintArray(array);
    }

}
