package decorate.demo;


/**
 * 装饰器模式的应用场景
 * 前面讲解了关于装饰器模式的结构与特点，下面介绍其适用的应用场景，装饰器模式通常在以下几种情况使用。
 * 当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类是终极类或者采用继承方式会产生大量的子类。
 * 当需要通过对现有的一组基本功能进行排列组合而产生非常多的功能时，采用继承关系很难实现，而采用装饰器模式却很好实现。
 * 当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 * 装饰器模式在 Java 语言中的最著名的应用莫过于 Java I/O 标准库的设计了。例如，
 * InputStream 的子类 FilterInputStream，OutputStream 的子类 FilterOutputStream，
 * Reader 的子类 BufferedReader 以及 FilterReader，
 * Writer 的子类 BufferedWriter、FilterWriter 以及 PrintWriter 等，它们都是抽象装饰类。
 */
public class MorriganAensland {
  public static void main(String[] args) {
    Morrigan original = new Original();
    original.display();

    Morrigan succubus = new Succubus(original);
    succubus.display();

    Morrigan girl = new Girl(original);
    girl.display();

  }
}
