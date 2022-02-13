package com.structure;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
  public static void main(String[] args) {


    Deque dq = new LinkedList();
    dq.push(1);
    dq.push(2);
    dq.push(3);

//    dq.pop();
    dq.peek();

    System.out.println(dq.pop());
    System.out.println(dq.pop());
    System.out.println(dq.pop());
    System.out.println(dq);

  }
}
