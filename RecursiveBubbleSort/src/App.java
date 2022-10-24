public class App {
    static void RecursiveBubbleSort(int[] array, int length) {
        if (length == 0) {
            return;
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i + 1] < array[i]) {
                Swap(array, i, i + 1);
                count = count++;
            }
            if (count == 0) {
                return;
            }
            RecursiveBubbleSort(array, length - 1);
        }

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
        int[] array = { 80, 60, 10, 30, 50, 20, 40, 100, 90, 70 };
        System.out.println("Unsorted Array:");
        PrintArray(array);
        RecursiveBubbleSort(array, array.length);
        System.out.println("Sorted Array:");
        PrintArray(array);
    }

}
