package com.structure.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheDemo {

  private int cacheSize;
  Map<Integer,Node<Integer,Integer>> map;
  DoubleLinkedList<Integer,Integer> doubleLinkedList;

  @Override
  public String toString() {
    return "LRUCacheDemo{" +
        "cacheSize=" + cacheSize +
        ", map=" + map +
        ", doubleLinkedList=" + doubleLinkedList +
        '}';
  }

  public LRUCacheDemo(int cacheSize){
    this.cacheSize = cacheSize;
    this.map = new HashMap<>();
    this.doubleLinkedList = new DoubleLinkedList<>();
  }

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }
    Node<Integer, Integer> node = map.get(key);
    doubleLinkedList.delNode(node);
    doubleLinkedList.addHead(node);
    return node.value;
  }

  public void put(int key ,int value) {
    if (map.containsKey(key)) {
      Node<Integer, Integer> node = map.get(key);
      node.value = value;
      map.put(key,node);
      doubleLinkedList.delNode(node);
      doubleLinkedList.addHead(node);
    } else {
      if (map.size() >= cacheSize) {
        Node<Integer, Integer> lastNode = doubleLinkedList.getLastNode();
        map.remove(lastNode.key);
        doubleLinkedList.delNode(lastNode);
      }
      Node<Integer, Integer> node = new Node<>(key, value);
      map.put(key,node);
      doubleLinkedList.addHead(node);
    }
  }

  class Node<K,V>{

    K key;
    V value;
    Node<K,V> pre;
    Node<K,V> next;

    public Node(){
      this.pre = this.next = null;
    }

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
      this.pre = this.next = null;
    }

  }

  class DoubleLinkedList<K,V> {

    Node head;
    Node tail;

    public DoubleLinkedList(){
      head = new Node();
      tail = new Node();
      head.next = tail;
      tail.pre = head;
    }

    public void addHead(Node<K,V> node) {
      node.next = head.next;
      node.pre = head;
      head.next = node;
      tail.pre = node;
    }

    public void delNode(Node<K,V> node) {
      node.pre.next = node.next;
      node.next.pre = node.pre;
      node.pre = null;
      node.next = null;
    }

    public Node<K,V> getLastNode(){
      return tail.pre;
    }

  }

  public static void main(String[] args) {
    LRUCacheDemo lruCacheDemo = new LRUCacheDemo(3);
    lruCacheDemo.put(1,1);
    lruCacheDemo.put(2,2);
    lruCacheDemo.put(3,3);
    System.out.println(lruCacheDemo);
    lruCacheDemo.put(4,4);
    System.out.println(lruCacheDemo);


  }
}
