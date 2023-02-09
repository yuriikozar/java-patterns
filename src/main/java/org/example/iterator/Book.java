package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class Book {
  private final List<Page> pages;

  private final MyIterator iterator;

  public Book(List<Page> pages) {
    this.pages = pages;
    this.iterator = new IteratorImpl(pages);
  }

  public List<String> readWholeBook() {
    List<String> allTheText = new ArrayList<>();
    while (iterator.hasNext()) {
      allTheText.add(iterator.getNext().getContent());
    }
    return allTheText;
  }

}
