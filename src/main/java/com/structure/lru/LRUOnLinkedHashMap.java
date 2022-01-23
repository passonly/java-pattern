package com.structure.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUOnLinkedHashMap<K,V> extends LinkedHashMap<K,V> {
  private int capacity;
  public LRUOnLinkedHashMap(int capacity) {
    //accessOrder – the ordering mode - true for access-order, false for insertion-order
    super(capacity, 0.75f, true);
    this.capacity = capacity;
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    return super.size() > capacity;
  }


  public static void main(String[] args) {

    LRUOnLinkedHashMap<Object, Object> lru = new LRUOnLinkedHashMap<>(3);
    lru.put("aKey","a");
    lru.put("bKey","b");
    lru.put("cKey","c");
    System.out.println(lru.keySet());

    lru.put("dKey","d");
    System.out.println(lru);

    lru.put("cKey","c");
    System.out.println(lru);
    lru.put("cKey","c");
    System.out.println(lru);
    lru.put("cKey","c");
    System.out.println(lru);

    lru.put("eKey","e");
    System.out.println(lru);

  }
}
