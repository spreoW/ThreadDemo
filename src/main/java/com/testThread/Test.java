package com.testThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author w
 * @date 2021/1/11
 */
public class Test {
    public static void main(String[] args) {
      List<Integer> list= new ArrayList<>();
      addList(list,1,2,3,4,5);
      list.forEach(item -> System.out.println("item="+item));
      System.out.println("aa");
    }
    public static void addList(List<Integer> list,Integer... a){
    }
}
