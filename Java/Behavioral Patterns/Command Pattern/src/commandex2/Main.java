package commandex2;

import commandex2.editor.Editor;

/*
Command is a behavioral design pattern that turns a request into a stand-alone object that contains
all information about the request. This transformation lets you parameterize methods with different requests,
delay or queue a request’s execution, and support undoable operations.
 */

/*
Use the Command pattern when you want to parametrize objects with operations.
Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
Use the Command pattern when you want to implement reversible operations.
 */

/*
The Client creates and configures concrete command objects. The client must pass all of the request parameters,
including a receiver instance, into the command’s constructor. After that, the resulting command may be associated
with one or multiple senders.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
