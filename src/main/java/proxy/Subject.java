package proxy;

interface Subject {

  void request();
  default void testInterfaceConcreteMethod() {
    System.out.println("fdafasfdas");
  }

  static Integer testStaticMethod(){
    return 1;
  }
}
