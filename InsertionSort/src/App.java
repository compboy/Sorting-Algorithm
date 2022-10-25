public class App {
    static void InsertionSort(int[] array, int len) {

        for (int i = 1; i < len; i++) {
            int j = i - 1;
            int x = array[i];
            while (j > -1 && array[j] > x) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = x;
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
        InsertionSort(array, array.length);
        System.out.println("Sorted Array:");
        PrintArray(array);
    }
}
