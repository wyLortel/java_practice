package method;

public class MethodReturn2 {
    public static void main(String[] args) {
       checkaAge(12);
        checkaAge(20);
    }

    public static void checkaAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자 출입이 불가능합니다");
            return;
        }

        System.out.println("입장하세요");
    }
}
