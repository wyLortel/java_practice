package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("두 문자열 비교 " + (str1 == str2));
        System.out.println("두 문자열 이퀄스 비교" + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교" + (str3 == str4));
        System.out.println("리터럴 이퀄스 비교" + (str3.equals(str4)));



    }
}
