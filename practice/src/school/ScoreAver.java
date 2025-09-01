package school;

class Myperson {
    int x1;
    int x2;
    int x3;

    public void aver() {
        int sum = this.x1 + this.x2 + this.x3;
        double result = (double) sum / 3;
        System.out.println(result);
    }
//    public Myperson(int score) {
//        this.score = score;
    }


public class ScoreAver {
    public static void main(String[] args) {
//        Myperson student1 = new Myperson(90);
//        Myperson student2 = new Myperson(80);
//        Myperson student3 = new Myperson(70);
//
//        double aver = (student1.score + student2.score + student3.score) / 3.0;
//        System.out.println(aver); //


        Myperson myperson = new Myperson();
        myperson.x1 = 100;
        myperson.x2 = 80;
        myperson.x3 = 80;

        ;
//        double result = (double) (myperson.x1 + myperson.x2 + myperson.x3) / 3
//        System.out.println(result);
        myperson.aver();
    }
}
