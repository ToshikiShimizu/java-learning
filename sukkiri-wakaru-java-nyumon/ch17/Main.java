import java.io.*;

public class Main{
    public static void main(String[] args){
        // 17-9
        FileWriter fw = null;
        try{
            fw = new FileWriter("data.txt");
            fw.write("hello");
            
        } catch (Exception e){
            System.out.println("何らかの例外が発生しました");
        } finally{
            if (fw != null) {
                try{
                    fw.close();
                } catch (IOException e){
                    ;
                }
            }
        }
        // 17-10
        try (FileWriter fw2 = new FileWriter("data.txt");){
            fw2.write("hello!");
        } catch (Exception e){
            System.out.println("何らkなの例外が発生しました");
        }

        // 17-11
        Person p = new Person();
        //p.setAge(-128);
        p.setAge(28);

        // 17-12
        try {
            throw new UnsupportedMusicFlieException("未対応のファイルです");
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}