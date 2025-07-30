package poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSende(), new FaceBookSender()};

        for (Sender se : senders) {
            se.sendMessage("안녕하세요! 자바천재 정우영님!");
        }
    }
}
