package hilell.l11.messengers;

public class TelegramMessenger implements Messenger{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sent to Telegram!");
    }
}
