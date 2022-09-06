public class Main {
    public static void main(String[] args) {

        long[] array = MinMaxAverageInRandomArray.randomArray(50);
        long min = array[0];
        long max = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += (double)array[i]/array.length;
            if (array[i] > max) {
                max = array[i];
                continue;
            }
            if (array[i] < min) min = array[i];
        }
        System.out.println("Minimal value:" + min + "\n"
                + "Maximal value:" + max + "\n"
                + "Average value:" + average);



        BubbleSort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
