package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String mes) {
        System.out.println("메일을 발송합니다: " + mes);
    }
}
