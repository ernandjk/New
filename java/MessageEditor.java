// The `package java;` statement at the beginning of the Java file is declaring that the
// `MessageEditor` class belongs to the `java` package. This helps in organizing classes into different
// namespaces or packages to avoid naming conflicts and provide a logical structure to the codebase.
package java;

import java.lang.ModuleLayer.Controller;

public class MessageEditor<Message> {
    private Controller controller;

    public MessageEditor(Controller controller) {
        this.controller = controller;
    }

    public Message editMessage(Message message) {
        return controller.editMessage(message);
    }
}