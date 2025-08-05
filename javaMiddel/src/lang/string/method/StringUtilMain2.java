package lang.string.method;

public class StringUtilMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String string = "Hello, Java";

        String format1 = String.format("num: %d , bool : %b, str: %s", num, bool, string);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        System.out.printf("숫자: %.2f\n", 10.1234);

        String regex = "Hello, (Java!wordl)";
        System.out.println("str이 일치하는가" + string.matches(regex));
    }
}
