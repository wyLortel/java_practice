package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        for (;;) {
            sum =sum + 1 ;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " + sum);
                break;
            }
        }
        i++;
    }
}
