package hilell.l11.messengers;

public class MailMessenger implements Messenger {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sent my mail!");
    }
}
