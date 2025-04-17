package scd.lab12.commandpattern;

public class CommandTest {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Command cut = new CutCommand(editor);
        Command copy = new CopyCommand(editor);
        Command paste = new PasteCommand(editor);
        Command undo = new UndoCommand(editor);

        Button cutBtn = new Button(cut);
        Button copyBtn = new Button(copy);
        Button pasteBtn = new Button(paste);
        Button undo
        Btn = new Button(undo);

        System.out.println("--- User clicks Cut ---");
        cutBtn.click();

        System.out.println("--- User clicks Copy ---");
        copyBtn.click();

        System.out.println("--- User clicks Paste ---");
        pasteBtn.click();

        System.out.println("--- User clicks Undo ---");
        undoBtn.click();
    }
}
