package java;
public class MessageFilter {
    private Controller controller;

    public MessageFilter(Controller controller) {
        this.controller = controller;
    }

    public boolean shouldAllowMessage(Message message) {
        return controller.shouldAllowMessage(message);
    }
}