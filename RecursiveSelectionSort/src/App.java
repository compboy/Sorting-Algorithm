public class App {

    static void RecursiveSelectionSort(int[] array, int len, int index) {
        if (index == len) {
            return;
        }
        int minIndex = MinIndex(array, index, len - 1);
        if (minIndex != index) {

            Swap(array, minIndex, index);
        }
        RecursiveSelectionSort(array, len, index + 1);
    }

    static int MinIndex(int[] array, int min, int len) {
        if (min == len)
            return min;

        int minIndex = MinIndex(array, min + 1, len);
        return (array[min] < array[minIndex]) ? min : minIndex;
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
        RecursiveSelectionSort(array, array.length, 0);
        System.out.println("Sorted Array:");
        PrintArray(array);
    }
}
