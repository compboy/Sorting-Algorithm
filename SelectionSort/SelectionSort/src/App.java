
public class App {
    static void Sort(int[] array) {

        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            Swap(array, minIndex, i);

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
        Sort(array);
        System.out.println("Sorted Array:");
        PrintArray(array);

    }
}
