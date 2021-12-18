package decorate.demo;

public class Girl extends Changer{

  public Girl(Morrigan m) {
    super(m);
  }

  @Override
  public void display(){
    setChanger();
    super.display();
  }

  private void setChanger() {
    ((Original)super.m).setImage("2.png");
  }

}
