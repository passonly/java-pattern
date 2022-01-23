package com.pattern.decorate.demo;

public class Succubus extends Changer{


  public Succubus(Morrigan m) {
    super(m);
  }

  @Override
  public void display(){
    setChanger();
    super.display();
  }

  private void setChanger() {
    ((Original)super.m).setImage("1.png");
  }


}
