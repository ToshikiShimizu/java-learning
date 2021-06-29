import java.io.File;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class Main{
    public static void main(String[] args) throws IOException{
        // FileWriter fw = new FileWriter("./rpgsave.dat", true);
        // 6-1
        // fw.write('A');
        // fw.flush();
        // fw.close();

        // 6-2
        FileReader fw = new FileReader("./rpgsave.dat");
        System.out.println("すべてのデータを読んで表示します");
        int i = fw.read();
        while (i!=-1){
            char c = (char)i;
            System.out.print(c);
            i = fw.read();
        }
        System.out.println("ファイルの末尾に到達しました");
        fw.close();

        // 6-3
        FileOutputStream fos = new FileOutputStream("./rpgsave.dat", true);
        fos.write(65);
        fos.flush();
        fos.close();

        // 6-5
        try (
            FileWriter fw2 = new FileWriter("./rpgsave.dat", true);
         ) {
            fw2.write('A');
            fw2.flush();
        } catch (IOException e){
            System.out.println("ファイル書き込みエラーです");
        }        

        // 6-7
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(65);
        byte[] data = baos.toByteArray();
        for (byte b: data){
            System.out.println(b);
        }        
    }
}