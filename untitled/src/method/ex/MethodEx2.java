package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world";
        printMsg(8,message);
    }


    public static void printMsg(int n , String msg) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }

}




