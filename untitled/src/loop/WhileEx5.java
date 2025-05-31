package loop;

public class WhileEx5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 3;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
