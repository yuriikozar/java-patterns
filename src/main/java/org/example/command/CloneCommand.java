package org.example.command;

public class CloneCommand extends Command {
  public CloneCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    editor.clipboard = editor.textField.getSelectedText();

    if (editor.clipboard == null || editor.clipboard.isEmpty()) {
      return false;
    }

    backup();
    editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
    return true;
  }
}
