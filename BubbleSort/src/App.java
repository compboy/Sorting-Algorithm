public class App {

    static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    Swap(array, j, j + 1);
                }
            }
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
        BubbleSort(array);
        System.out.println("Sorted Array:");
        PrintArray(array);
    }
}
