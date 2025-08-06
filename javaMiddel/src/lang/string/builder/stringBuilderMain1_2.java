package lang.string.builder;

public class stringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string1 = sb.append("A").append("B").append("c").append("d").insert(4, "java").delete(4, 8).reverse().toString();

        System.out.println("string1 = " + string1);
    }
}
