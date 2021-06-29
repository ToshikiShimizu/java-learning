import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 7-1
        Reader fr = new FileReader("pref.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
        fr.close();

        // 7-2
        ResourceBundle rb = ResourceBundle.getBundle("pref");
        System.out.println(rb.getString("aichi.capital") + ":" + rb.getString("aichi.food"));

        // 7-3
        Employee tanaka = new Employee();
        tanaka.name = "田中一郎";
        tanaka.age = 41;
        Department soumubu = new Department();
        soumubu.name = "総務部";
        soumubu.leader = tanaka;
        FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(soumubu);
        oos.flush();
        oos.close();
    }
}