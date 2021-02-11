package commandex2.commands;

import commandex2.editor.Editor;

/**
 * Concrete Commands implement various kinds of requests. A concrete command isn’t supposed to perform the work on
 * its own, but rather to pass the call to one of the business logic objects. However, for the sake of simplifying
 * the code, these classes can be merged.
 *
 * Parameters required to execute a method on a receiving object can be declared as fields in the concrete command.
 * You can make command objects immutable by only allowing the initialization of these fields via the constructor.
 */
public class CopyCommand extends Command{

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
