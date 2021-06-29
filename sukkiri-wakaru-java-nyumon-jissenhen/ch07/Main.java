import java.io.File;

import org.w3c.dom.NodeList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.w3c.dom.*;

import com.fasterxml.jackson.databind.*;


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
        // Reader fr = new FileReader("./rpgsave.properties");
        // Properties p = new Properties();
        // p.load(fr);
        // String name = p.getProperty("heroName");
        // String strHp = p.getProperty("heroHp");
        // int hp = Integer.parseInt(strHp);
        // System.out.println("勇者の名前:" + name);
        // System.out.println("勇者のHP:" + hp);
        // fr.close();

        // 7-6
        // Writer fw = new FileWriter("./rpgsave.properties");
        // Properties p = new Properties();
        // p.setProperty("heroName", "アサカ");
        // p.setProperty("heroHp", "62");
        // p.setProperty("herpMp", "45");
        // p.store(fw, "勇者の情報");
        // fw.close();

        // 7-7
        // ResourceBundle rb = ResourceBundle.getBundle("sukkiri-wakaru-java-nyumon-jissenhen.ch07.rpgsave");
        // String heroName = rb.getString("heroName");
        // System.out.println("勇者の名前:" + heroName);

        // 7-8
        // Locale loc = Locale.getDefault();
        // System.out.println(loc.getCountry() + "-" + loc.getLanguage());
        // String now = (new SimpleDateFormat()).format(new Date());
        // ResourceBundle rb2 = ResourceBundle.getBundle("message");
        // System.out.println(rb2.getString("CURENT_TIME_IS") + now);

        // 7-9
        // InputStream is = new FileInputStream("rpgsave.xml");
        // Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
        // Element hero = doc.getDocumentElement();
        // Element weapon = findChildByTag(hero, "weapon");
        // Element power = findChildByTag(weapon, "power");
        // String value = power.getTextContent();

        // 7-10
        // ObjectMapper mapper = new ObjectMapper();
        // JsonNode root = mapper.readTree(new File("hero.json"));
        // JsonNode hero = root.get("hero");
        // JsonNode weapon = hero.get("weapon");
        // System.out.println("名前:" + hero.get("name").textValue());
        // System.out.println("武器:" + weapon.get("name").textValue());

        // 7-11
        // ObjectMapper mapper = new ObjectMapper();
        // JsonFileData file = mapper.readValue (new File("hero.json"), JsonFileData.class);
        // System.out.println("名前:" + file.hero.name);
        // System.out.println("武器:" + file.hero.weapon.name);

        // 7-14
        Hero hero1 = new Hero("ミナト", 75, 18);
        FileOutputStream fos = new FileOutputStream("rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();
        ois.close();
    }
    
        // static Element findChildByTag(Element self, String name) throws Exception{
        //     NodeList children = self.getChildNodes();
        //     for (int i = 0; i < children.getLength(); i++){
        //         if (children.item(i) instanceof Element){
        //             Element e = (Element) children.item(i);
        //             if (e.getTagName().equals(name)){
        //                 return e;
        //             }
        //         }
        //     }
        //     return null;
        // }


}