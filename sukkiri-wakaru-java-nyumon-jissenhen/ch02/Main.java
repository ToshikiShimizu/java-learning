import java.util.*;

public class Main {
    // public static void main(String[] args){
    //     Pocket<String> p = new Pocket<>();
    //     p.put("1192");
    //     String s = p.get();
    //     System.out.println(s);

    //     // 2-11
    //     Outer.Inner ic = new Outer.Inner();
    // }

  public static Optional<String> decorate(String s, char c) {
    String r;
    if (s == null || s.length() == 0) {
      r = null;
    } else {
      r = c + s + c;
    }
    return Optional.ofNullable(r);
  }

  public static void main(String[] args) {
    Optional<String> s = decorate("", '*');
    System.out.println(s.orElse("nullのため処理できません"));
  }
}