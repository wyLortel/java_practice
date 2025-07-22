package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        int sum = sum(values);
        double average = (double) sum / values.length;
        return average;
    }

    public static int min(int[] values) {
        int min = values[0];

        for (int value : values) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];

        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }











}
