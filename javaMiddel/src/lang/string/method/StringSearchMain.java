package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String string = "Hello, JAVA! Welcome to Java world.";

        System.out.println("문자열에 java 가 포함되어잇는지: " + string.contains("Java"));
        System.out.println("Java의 첫번재 인덱스: " + string.indexOf("Java"));
        System.out.println("인덱스 10부터 Java의 인덱스: " + string.indexOf("Java", 10));
        System.out.println("Java의 마지막 인덱스: " + string.lastIndexOf("Java"));
    }
}
