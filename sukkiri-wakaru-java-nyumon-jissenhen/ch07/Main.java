import java.io.FileReader;
import java.util.*;
import org.apache.commons.csv.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 7-3
        String s = "minato,asaka,sugawara";
        String[] st = s.split(",");
        for (String t : st){
            System.out.println(t);
        }

        // 7-4
        // FileReader fr = new FileReader("rpgdata.csv");
        // Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
        // for (CSVRecord r : records){
        //     String name = r.get(0);
        //     String hp = r.get(1);
        //     String mp = r.get(2);
        //     System.out.println(name + "/" + hp + "/" + mp);
        // }
        // fr.close();

        // 7-5
        Reader fr = new FileReader("./rpgsave.properties");
        Properties p = new Properties();
        p.load(fr);
        String name = p.getProperty("heroName");
        String strHp = p.getProperty("heroHp");
        int hp = Integer.parseInt(strHp);
        System.out.println("勇者の名前:" + name);
        System.out.println("勇者のHP:" + hp);
        fr.close();

        // 7-6
        // Writer fw = new FileWriter("./rpgsave.properties");
        // Properties p = new Properties();
        // p.setProperty("heroName", "アサカ");
        // p.setProperty("heroHp", "62");
        // p.setProperty("herpMp", "45");
        // p.store(fw, "勇者の情報");
        // fw.close();

        // 7-7
        ResourceBundle rb = ResourceBundle.getBundle("sukkiri-wakaru-java-nyumon-jissenhen.ch07.rpgsave");
        String heroName = rb.getString("heroName");
        System.out.println("勇者の名前:" + heroName);
    }
}