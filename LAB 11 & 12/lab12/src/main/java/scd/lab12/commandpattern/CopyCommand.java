package scd.lab12.commandpattern;

public class CopyCommand implements Command {
    private TextEditor editor;
    public CopyCommand(TextEditor editor) { this.editor = editor; }

    public void execute() { editor.copy(); }
}
