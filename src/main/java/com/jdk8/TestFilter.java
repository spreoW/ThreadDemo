package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangquan
 * @date 2021/5/25
 * ²âÊÔ¹ýÂËÌõ¼þ
 */
public class TestFilter {

  public static void main(String[] args) {
    Book b1 = Book.builder().id(1).name("zs").price(10.00).build();
    Book b2 = Book.builder().id(2).name("ls").price(20.00).build();
    Book b3 = Book.builder().id(3).name("ww").price(30.00).build();
    List<Book> bookList = new ArrayList<>();
    bookList.add(b1);
    bookList.add(b2);
    bookList.add(b3);
    List<Book> books = bookList.stream().filter(book -> book.getPrice() > 10)
        .collect(Collectors.toList());
    System.out.println(books);
  }

}
