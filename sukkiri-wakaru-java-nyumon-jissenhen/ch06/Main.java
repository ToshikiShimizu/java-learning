import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

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
    }
}