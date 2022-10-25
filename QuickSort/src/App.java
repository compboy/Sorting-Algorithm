public class App {

    static void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int j = Partition(array, low, high);
            QuickSort(array, low, j - 1);
            QuickSort(array, j + 1, high);
        }
    }

    static int Partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                Swap(array, i, j);
            }
        }
        Swap(array, i + 1, high);
        return i + 1;
    }

    static void Swap(int[] array, int min, int max) {
        int temp;
        temp = array[min];
        array[min] = array[max];
        array[max] = temp;
    }

    static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        try {
            int[] array = { 80, 60, 10, 30, 50, 20, 40, 100, 90, 70 };
            System.out.println("Unsorted Array:");
            PrintArray(array);
            QuickSort(array, 0, array.length - 1);
            System.out.println("Sorted Array:");
            PrintArray(array);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
