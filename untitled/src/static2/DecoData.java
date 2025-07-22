package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++;
        staticMethod();
    }

    public  void instanceCall(){
        instanceValue++;
        instanceVMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceVMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
