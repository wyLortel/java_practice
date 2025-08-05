package lang.string.method;

public class StringUtilMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object object = new Object();
        String string = "Hello, Java";


        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 =" + numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolString);

        String objectString = String.valueOf(object);
        System.out.println("객체의 문자열 값: " + objectString);

        String numString2 = "" + num;
        System.out.println("빈 문자열 + num " + numString2);

        char[] strCharArray = string.toCharArray();
        System.out.println("문자열을 문자 배열로 변환" + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }


    }
}
