package com.structure.linked;

public class LinkedList {

  public class Node {

    private int val;
    private Node next;

    Node(int val){
      this.val = val;
      this.next = null;
    }
  }


  Node head;

  Node reverse(Node node){
    Node pre = head.next;
    Node cur = pre.next;

    while (cur != null) {
      pre.next = cur.next;
      cur.next = head.next;
      head.next = cur;
      cur = pre.next;
    }
    return head.next;
  }

}
