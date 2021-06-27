import java.util.function.*;

public class Main{
    public static Integer len(String s){
        return s.length();
    }
    public static void main(String[] args){
        // 3-2
        Function<String, Integer> func = Main::len;
        int a = func.apply("Java");
        System.out.println("文字列Javaは" + a + "文字です");
        
        // 3-4
        Function<String, Integer> func2 = (String s) -> {return s.length();};
        int n = func2.apply("Java");
        System.out.println("文字列Javaは" + n + "文字です");
    }
}