public class BubbleSort {
    public static void bubbleSort(long[] array) {
        int k = array.length;
        long t;
        for (int i = 0; i < array.length; i++) {
            k--;
            for (int j = 0; j < k; j++) {
                if (array[j] > array[j+1]) {
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
}
