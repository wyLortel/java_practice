package method;

public class Method2 {
    public static void main(String[] args) {
        printHender();
        System.out.println("프로그램을 동작합니다");
        printFooter();

    }

    public static void printHender() {
        System.out.println("= 프로그램을 시작합니다 = ");
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 = ");
    }
}
