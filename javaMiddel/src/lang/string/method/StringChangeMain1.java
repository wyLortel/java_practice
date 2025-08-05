package lang.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String string = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 부분 문자열: " + string.substring(7));
        System.out.println("인덱스 7부터의 12까지의 부분 문자열: " + string.substring(7,12));

        System.out.println("문자열 결합: " + string.concat("!!!"));

        System.out.println("'Java 라는 문자열을 World 로 대체: '" + string.replace("Java","World"));
        System.out.println("첫번째 Java를 world로 대체: " + string.replaceFirst("Java", "Wolrd"));

    }
}
