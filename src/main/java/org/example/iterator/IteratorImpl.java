package org.example.iterator;

import java.util.List;

public class IteratorImpl implements MyIterator {
  private int cursor;

  List<Page> pages;

  public IteratorImpl(List<Page> pages) {
    this.pages = pages;
  }

  @Override
  public boolean hasNext() {
    return cursor < pages.size();
  }

  @Override
  public Page getNext() {
    int i = cursor;
    cursor++;
    return pages.get(i);
  }

  @Override
  public void reset() {
    cursor = 0;
  }
}
