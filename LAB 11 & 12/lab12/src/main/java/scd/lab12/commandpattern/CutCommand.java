
package scd.lab12.commandpattern;

public class CutCommand implements Command {
    private TextEditor editor;
    public CutCommand(TextEditor editor) { this.editor = editor; }

    public void execute() { editor.cut(); }
}
