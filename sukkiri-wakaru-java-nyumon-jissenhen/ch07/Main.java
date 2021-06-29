import java.io.FileReader;
import java.util.*;
import org.apache.commons.csv.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 7-3
        String s = "minato,asaka,sugawara";
        String[] st = s.split(",");
        for (String t : st){
            System.out.println(t);
        }

        // 7-4
        FileReader fr = new FileReader("rpgdata.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
        for (CSVRecord r : records){
            String name = r.get(0);
            String hp = r.get(1);
            String mp = r.get(2);
            System.out.println(name + "/" + hp + "/" + mp);
        }
        fr.close();
    }
}