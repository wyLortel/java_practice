package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        //일반 for문
//        for (int i = 0; i < numbers.length; i++) {
////            int number = numbers[i];
//            System.out.println(numbers[i]);
//        }

        //향상된 for 문
        for (int number : numbers) {
            System.out.println(number);
        }

        //향상된 for문 사용 불가 인덱스를 필요로 함
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }






    }
}
