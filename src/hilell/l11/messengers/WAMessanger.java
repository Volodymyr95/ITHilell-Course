package hilell.l11.messengers;

public class WAMessanger implements Messenger {

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sent to WA!");
    }
}
