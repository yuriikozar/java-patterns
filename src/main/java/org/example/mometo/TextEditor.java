package org.example.mometo;

import java.util.HashMap;
import java.util.Map;

// Originator: TextEditor
class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void appendText(String text) {
        content.append(text);
    }

    public String getText() {
        return content.toString();
    }

    public Memento save() {
        return new Memento(content.toString());
    }

    public void restore(Memento memento) {
        content = new StringBuilder(memento.getState());
    }
}