package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangquan
 * @date 2021/5/25
 * 根据bookId分组
 */
public class TestMap {

  public static void main(String[] args) {
    Book b1 = Book.builder().id(1).name("zs").price(10.00).build();
    Book b2 = Book.builder().id(2).name("ls").price(20.00).build();
    Book b3 = Book.builder().id(3).name("ww").price(30.00).build();
    Book b4 = Book.builder().id(1).name("zl").price(40.00).build();
    Book b5 = Book.builder().id(3).name("tq").price(50.00).build();
    List<Book> bookList = new ArrayList<>();
    bookList.add(b1);
    bookList.add(b2);
    bookList.add(b3);
    bookList.add(b4);
    bookList.add(b5);
    // 根据ID分组
    Map<Integer, List<Book>> bookMap = bookList.stream()
        .collect(Collectors.groupingBy(Book::getId));
    for (Map.Entry<Integer, List<Book>> entry : bookMap.entrySet()){
      System.out.println(entry.getKey() +" : "+entry.getValue());
    }
  }
}
