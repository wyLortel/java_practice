package poly.ex.sender;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String mes) {
        System.out.println("페이스북에 발송합니다: " + mes);
    }
}
