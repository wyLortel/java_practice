package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m생존 시작
        if (true) {
            int x = 20;
            System.out.println("if m =" + m);
            System.out.println("if x =" + x);
        }

//        System.out.println(x); a
        System.out.println(m);


    }
}
