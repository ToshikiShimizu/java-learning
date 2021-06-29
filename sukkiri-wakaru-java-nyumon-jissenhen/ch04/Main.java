import java.util.*;
import java.text.*;
import java.lang.reflect.*;

public class Main{
    public static void main(String[] args) throws Exception{
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

        // 4-7
        Class<?> info1 = String.class;
        System.out.println(info1.getSimpleName());
        System.out.println(info1.getName());
        System.out.println(info1.getPackage().getName());

        System.out.println(info1.isArray());
        Class<?> info2 = info1.getSuperclass();
        System.out.println(info2.getName());
        Class<?> info3 = args.getClass();
        System.out.println(info3.isArray());

        // 4-8
        Class<?> clazz = RefSample.class;
        Constructor<?> cons = clazz.getConstructor(int.class);
        RefSample rs = (RefSample)cons.newInstance(256);
        Field f = clazz.getField("times");
        f.set(rs, 2);
        System.out.println(f.get(rs));
        Method m = clazz.getMethod("hello", String.class, int.class);
        m.invoke(rs, "reflection!", 128);
        boolean pubc = Modifier.isPublic(clazz.getModifiers());
        boolean tinm = Modifier.isFinal(m.getModifiers());

    }
}