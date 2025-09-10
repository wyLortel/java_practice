package school;

public class Star {

    public static void main(String[] args) {
        int col = 5;

        for (int i = 1; i <= col; i++) {
            for (int k = 1; k <= col - i; k++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //        for (int i = 0; i < col; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
