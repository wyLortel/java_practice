package poly.ex.sender;

public class SmsSende implements Sender {
    @Override
    public void sendMessage(String mes) {
        System.out.println("SMS를 발송합니다: " + mes);
    }
}
