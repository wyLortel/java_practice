package school;

public class ExceptionEx {

    public static void main(String[] args) {
        System.out.println("start");
        int x = 10;
        int y = 0;
        int r = 0;
        try {
            r = x/y;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("산술연산 오류 발생");
        }
//        System.out.println(r); 지
        System.out.println(r);
        System.out.println("end");

        int[] k = new int[3];
        k[0] = 0;
        k[1] = 10;
        k[2] = 100;

        try {
            System.out.println(k[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열범위넘어가는 오류 발생");
            System.out.println(e);
            e.printStackTrace();
        }

        try {
            int x1 = 10;
            int x2 = 0;
            int[] xx1 = {10, 20, 30};
            System.out.println(xx1[3]);
        } catch (Exception e) {
            System.out.println("Exception 퉁쳐내기");
            System.out.println(e);
        }


    }



}
//예외처리를 하는것보다 일단 예외가 발생하지않게하는게 이상적인 코드
//예외처리의 주요 목적은 프로그램 강제 종료 방지
//\Exception 은 자바예외클래스의 최상의 클래스 따라서  모둔 예외는 Exception로 퉁쳐내서 잡아낼수잇음