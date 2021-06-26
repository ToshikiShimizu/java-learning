import java.util.ArrayList;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        // 16-1
        // Set, List, Map

        // 16-2
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        ArrayList<Hero> array = new ArrayList<>();
        array.add(h1);
        array.add(h2);
        for (Hero h : array){
            System.out.println(h.getName());
        }

        // 16-3
        HashMap<Hero, Integer> hash = new HashMap<>();
        hash.put(h1, 3);
        hash.put(h2, 7);
        for (Hero key : hash.keySet()){
             System.out.println(key.getName() + "が倒した敵=" + hash.get(key));
        }

    }
}