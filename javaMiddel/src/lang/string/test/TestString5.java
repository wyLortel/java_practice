package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index1 = str.indexOf(ext);

        String filename = str.substring(0, index1);
        String extName = str.substring(index1);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
