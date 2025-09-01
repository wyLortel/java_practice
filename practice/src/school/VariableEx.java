package school;

public class VariableEx {

    int x = 10;

    public void printX() {
        System.out.println(x);
    }

    public void printY() {
        x = 100;
        System.out.println(x);
    }


    //자바에서 로직 코드는 전부 메서드 안에서 작성해야함

    public static void main(String[] args) {
        int y = 10;
        System.out.println(y);


        VariableEx variableEx = new VariableEx();
        variableEx.printX();

    }


}
