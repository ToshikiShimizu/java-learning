import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        // 16-1
        ArrayList<Integer> points = new ArrayList<>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points){
            System.out.println(i);
        }

        // 16-2
        Iterator<Integer> it = points.iterator();
        while (it.hasNext()){
            int e = it.next();
            System.out.println(e);
        }

        // 16-3
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("bule");
        colors.add("yellow");
        colors.add("red");
        System.out.println("色は"+colors.size()+"種類");

        // 16-4
        for (String s : colors){
            System.out.print(s+"->");
        }
        System.out.println();

        // 16-5
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for (String s : words){
            System.out.print(s + "->");
        }
        System.out.println();

        // 16-6
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        int tokyo = prefs.get("東京都");
        System.out.println("東京都の人口は、" + tokyo);
        prefs.remove("京都府");
        prefs.put("熊本県", 182);
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は、" + kumamoto);

        // 16-7
        for (String key : prefs.keySet()){
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value);
        }
    }
}