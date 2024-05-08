package java;
public class MessageSender {
    private Original original;

    public MessageSender(Original original) {
        this.original = original;
    }

    public void sendMessage(String text, Contact contact) {
        ((MessageSender) original).sendMessage(text, contact);
    }
}
