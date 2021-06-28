import java.util.*;
import java.text.*;

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

        // 4-5
        Locale loc = Locale.getDefault();
        System.out.println(loc.getCountry() + "-" + loc.getLanguage());
        String now = (new SimpleDateFormat()).format(new Date());
        if (loc.getLanguage().equals("ja")){
            System.out.println("現在の時刻は" + now);
        } else {
            System.out.println("Current time is " + now);
        }

        // 4-6
        TimeZone tz = TimeZone.getDefault();
        System.out.print("現在のタイムゾーン:");
        System.out.println(tz.getDisplayName());
        if (tz.useDaylightTime()){
            System.out.println("夏時間を採用しています");
        }
        System.out.print("世界標準時との時差は");
        System.out.println(tz.getRawOffset() / 3600000 + "時間");

    }
}