package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String string = "Hello, Java!";
        System.out.println("문자열의 길이: " + string.length());
        System.out.println("문자열이 잇는지: " + string.isEmpty());
        System.out.println("문자열이 비엇거나 공백인지: " + string.isBlank());
        System.out.println("문자열이 비엇거나 공백인지: " +"      ".isBlank() );

        char c = string.charAt(7);
        System.out.println("7번 인덱스의 문자= " + c);

    }
}
