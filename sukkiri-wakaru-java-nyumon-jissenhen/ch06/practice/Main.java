import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main{
    public static void main(String[] args) throws Exception{
        // 6-1
        // String inFile = args[0];
        // String outFile = args[1];
        // FileInputStream fis = new FileInputStream(inFile);
        // FileOutputStream fos = new FileOutputStream(outFile);
        // int i = fis.read();
        // while (i != -1){
        //     fos.write(i);
        //     i = fis.read();
        // }
        // fos.flush();
        // fos.close();
        // fis.close();

        // 6-2
        if (args.length != 2){
            System.out.println("起動パラメータの指定が不正です");
            return;
        }
        String inFile = args[0];
        String outFile = args[1];

        try (
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            GZIPOutputStream gzos = new GZIPOutputStream(bos);
        ) {
            int i = fis.read();
            while (i!=-1){
                gzos.write(i);
                i = fis.read();
            }
            gzos.flush();
        } catch (IOException e){
            System.out.println("ファイル処理に失敗しました");
        }
    }
}