package org.example.iterator;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    String content = "Some content";
    String text = "Some text";
    String article = "Some article about science idk";
    Page page1 = new Page();
    page1.setContent(content);
    Page page2 = new Page();
    page2.setContent(text);
    Page page3 = new Page();
    page3.setContent(article);
    List<Page> pages = List.of(page1, page2, page3);
    Book book = new Book(pages);
    List<String> strings = book.readWholeBook();

    strings.forEach(System.out::println);
  }
}
