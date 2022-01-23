package com.pattern.proxy;

public class RealSubject implements Subject{
  @Override
  public void request() {
    System.out.println("真实主题方法");
    Class<?> aClass = super.getClass();
    System.out.println(aClass.getName());
  }
}
