interface Computer {
  void compileCode();
}


class laptop  implements Computer{
  public void compileCode() {
    System.out.println("you got 5 error");
  }
}
class Desktop implements Computer{
  public void compileCode() {
    System.out.println("you got 5 error,faster than laptop");
  }
}
class Developer {
  public void buildApp() {
    System.out.println("building app");
  }
}

public class MainCode {
  public static void main(String[] args) {
    Developer dev = new Developer();
    dev.buildApp();
    laptop lp = new laptop();
    lp.compileCode();
  }
}
