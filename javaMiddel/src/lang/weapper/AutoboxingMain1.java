package lang.weapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
