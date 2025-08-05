package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String string = "Apple,Banana,Orange";


        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }


        String joinStr = "";
//        for (String str : split) {
//            joinStr += str + "-";
//        }


        for (int i = 0; i < split.length; i++) {
            String string1 = split[i];
            joinStr += string1;
            if (i != split.length-1) {
                joinStr += "-";
            }
        }

        System.out.println("joinstr = " + joinStr);


        String joinedStr = String.join("-", "a", "b", "c");
        System.out.println("joinedStr = " + joinedStr);

        String result = String.join("-", split);
        System.out.println("result = " + result);
    }
}
