public class MinMaxAverageInRandomArray {
    static long[] randomArray(int length) {
        long[] array = new long[length];
        for (int i = 0; i < length; i++) {
            array[i] = (long)Math.round(Math.random()*Integer.MAX_VALUE);
        }
        return array;
    }
}
