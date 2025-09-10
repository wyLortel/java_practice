package school;

class Myperson2 {
    int age = 20;
    String name = "김길동";
    int score1 = 90;
    int score2 = 90;
    int score3 = 90;

    public Myperson2(int age , String name , int score1 , int score2 , int score3){
        this.age = age;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    // 학생의 평균 점수 계산
    public double sum() {
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.score1);
        System.out.println("수학: " + this.score2);
        System.out.println("영어: " + this.score3);
        return (double) (this.score1 + this.score2 + this.score3) / 3;
    }
}

public class aver2 {
    public static void main(String[] args) {
        Myperson2 myperson2 = new Myperson2(20,"김길동",90,90,90);
        double sum = myperson2.sum();
        System.out.println("평균: " + sum);

        System.out.println();

        Myperson2 myperson3 = new Myperson2(20,"박길동",80,80,80);
        double sum2 = myperson3.sum();
        System.out.println("평균: " + sum2);

        Myperson2 myperson4 = new Myperson2(20,"이길동",70,70,70);
        double sum3 = myperson4.sum();
        System.out.println("평균: " + sum3);

        Myperson2[] mypersons = {myperson2, myperson3, myperson4};

        System.out.println();
        double allResult = allAver(mypersons);
        System.out.println("전체 평균: " + allResult);  // 각 학생의 평균의 평균 출력
    }

    // 각 학생의 평균 점수를 평균내는 메서드
    static double allAver(Myperson2[] myPerson) {
        double total = 0;
        for (Myperson2 p : myPerson) {
            total += p.sum();  // 각 학생의 평균 점수 누적
        }
        System.out.println("총점 : " + total);
        return total / myPerson.length;  // 전체 학생 평균
    }
}

