package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        //indexOf()는 찾는 문자열이 없으면 -1을 반환
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;

        }
        System.out.println("count = " + count);
    }
}
