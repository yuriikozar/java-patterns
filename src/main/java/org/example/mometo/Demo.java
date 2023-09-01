package org.example.mometo;

public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.appendText("Version 1: This is some text.\n");
        long version1 = caretaker.saveMemento(editor.save());

        editor.appendText("Version 2: More text added.\n");
        long version2 = caretaker.saveMemento(editor.save());

        editor.appendText("Version 3: Even more text.\n");
        long version3 = caretaker.saveMemento(editor.save());


        editor.restore(caretaker.getMemento(version2));
        System.out.println("Restored Version 2:\n" + editor.getText());

        editor.restore(caretaker.getMemento(version1));
        System.out.println("Restored Version 1:\n" + editor.getText());

        editor.restore(caretaker.getMemento(version3));
        System.out.println("Restored Version 3:\n" + editor.getText());
    }
}