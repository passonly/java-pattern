package com.pattern.decorate.threoy;

public class ConcreteDecorator extends Decorator{

  public ConcreteDecorator(Component component) {
    super(component);
  }

  public void operation(){
    super.operation();
    addFunction();
  }

  private void addFunction() {
    System.out.println("增加额外的方法");
  }

}
