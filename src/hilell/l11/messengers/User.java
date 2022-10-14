package hilell.l11.messengers;

public class User {

    private String name;
    private Messenger messenger;

    public User(String name, Messenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }


    public void notifyPerson(String msg) {

        if (messenger instanceof WAMessanger) {
            System.out.println("Hello");
        } else {
            messenger.sendMessage(msg);
        }
    }
}
