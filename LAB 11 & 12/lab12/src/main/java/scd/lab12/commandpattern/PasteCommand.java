
package scd.lab12.commandpattern;

public class PasteCommand implements Command {
    private TextEditor editor;
    public PasteCommand(TextEditor editor) { this.editor = editor; }

    public void execute() { editor.paste(); }
}
