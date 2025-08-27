package school;

public class ArrayEx {

    public static void main(String[] args) {
        int[] x = {10, 20, 30};


        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);

        int[] y = x;
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(x[0]);
    }
}
