
package scd.lab12.commandpattern;

public class UndoCommand implements Command {
    private TextEditor editor;
    public UndoCommand(TextEditor editor) { this.editor = editor; }

    public void execute() { editor.undo(); }
}
