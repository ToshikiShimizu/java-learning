import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        // 17-1, 2
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            System.out.println("ーースタックトレース（ここまで）ーー");

        }

        // 17-3
        try {
            int i = Integer.parseInt("三");
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException例外をcatchしました");
        }

        // 17-4
        throw new IOException();
        
    }
}