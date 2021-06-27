import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    FuncList funclist = new FuncList();
    Func1 f1 = FuncList::isOdd;
    Func2 f2 = funclist::passCheck;
    System.out.println(f1.call(15));
    System.out.println(f2.call(66, "Smith"));

    // 3-2
    Func1 f3 = x->x%2==1;
    Func2 f4 = (point, name) -> {return name + "さんは" + (point > 65 ? "合格" : "不合格");};

    // 3-3
    IntPredicate f5 = x -> x % 2 == 1;
    Func2 f6 = (point, name) -> {
        return name + "さんは" + ( point > 65 ? "合格" : "不合格");
    };
    System.out.println(f5.test(15));
    System.out.println(f6.call(55, "Smith"));

    // 3-4
    List<String> names = List.of("湊","朝香","菅原","大江");
    names.stream().filter(n -> n.length() <= 4).map(n -> n + "さん").forEach(System.out::println);

  }
}
