package school;

//자바에서 메소드 정의 문법
//접근제한자 리턴형 메소드이름 (파라미터){실제코드}

//접근 제한자 종료 " public protected default private
//리턴형 종류: 기본자료형 , 객체형 ,void: 리턴없음

class Ramenya {

    public void makeRamen() {
        System.out.println("새우탕");
    }
}

public class MethodEx {
    public static void main(String[] args) {
        Ramenya ramenya = new Ramenya();
        ramenya.makeRamen();




    }
}
