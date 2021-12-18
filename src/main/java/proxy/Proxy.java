package proxy;

public class Proxy implements Subject{

  private RealSubject realSubject;
  private Subject subject;

  @Override
  public void request() {
    if (realSubject == null) {
      this.realSubject = new RealSubject();
    }
    preRequest();
    realSubject.request();
    postRequest();
    if (subject == null) {
      this.subject = new RealSubject();
    }
    subject.testInterfaceConcreteMethod();
  }

  public void postRequest() {
    System.out.println("访问真实主题后的处理");
  }

  public void preRequest() {
    System.out.println("访问真实主题前的处理");

  }
}
