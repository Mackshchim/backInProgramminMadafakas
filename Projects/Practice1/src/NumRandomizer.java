public class NumRandomizer {
    int[] numbers;
    int[] weights;
    int[] ranges;
    int sum;

    public NumRandomizer(int[] numbers, int[] weights) {
        this.numbers = numbers;
        this.weights = weights;

        sum = 0;
        ranges = new int[weights.length];
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            ranges[i] = sum;
        }
    }

    public int getRandomNumber() {
        double range = Math.random()*sum;
        for (int i = 0; i < ranges.length; i++) {
            if (range < ranges[i]) {
                return numbers[i];
            }
        }
        return numbers[numbers.length-1];
    }
}
