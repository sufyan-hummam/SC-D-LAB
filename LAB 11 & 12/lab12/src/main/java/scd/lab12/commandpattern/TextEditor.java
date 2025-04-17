
package scd.lab12.commandpattern;

public class TextEditor {
    public void cut() { System.out.println("Cutting selected text..."); }
    public void copy() { System.out.println("Copying selected text..."); }
    public void paste() { System.out.println("Pasting text..."); }
    public void undo() { System.out.println("Undoing last action..."); }
}
