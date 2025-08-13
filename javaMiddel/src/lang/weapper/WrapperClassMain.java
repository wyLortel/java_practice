package lang.weapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long l = Long.valueOf(100);
        Double v = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("v = " + v);
        System.out.println("l = " + l);

        int value = integerObj.intValue();
        System.out.println("value = " + value);

        long longValue = l.longValue();
        System.out.println("longValue = " + longValue);
        System.out.println(newInteger == integerObj);
        System.out.println(newInteger.equals(integerObj));
    }
}
