import java.util.*;
public class Main{
    public static void main(String[] args){
        // 4-1
        // System.exit(1);
        // System.out.println("正常終了しました");

        // 4-3
        System.out.print("利用中のJavaのバージョン:");
        System.out.println(System.getProperty("java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("システムプロパティ一覧");
        while (i.hasNext()){
            String key = i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
    
        // 4-4
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");
        System.out.println("RPG: スッキリ魔王征伐 ver" + ver);
        System.out.println("Developed by " + author);
    }
}