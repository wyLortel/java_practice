package lang.weapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int i3 = Integer.parseInt("10");
        
        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compare = " + compareResult);

        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("sum: " + Integer.min(10, 20));
        System.out.println("sum: " + Integer.max(10, 20));

    }
}
