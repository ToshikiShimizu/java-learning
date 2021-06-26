import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception{
        String s1 = "Java and JavaScript";
        String s2 = "Java";
        String s3 = "Java";
        if (s2.equals(s3)){
            System.out.println("s2 equals s3");
        }
        if (s2.equalsIgnoreCase(s3)){
            System.out.println("s2 equalsIgnoreCase s3");
        }
        System.out.println("s1 length :" + s1.length());
        if (s1.isEmpty()){
            System.out.println("s1 is empty.");
        }

        if (s1.contains("Java")){
            System.out.println("s1 contains Java");
        }

        if (s1.endsWith("Java")){
            System.out.println("s1 endsWith Java");
        }

        System.out.println("s1 indexof Java :" + s1.indexOf("Java"));
        System.out.println("s1 lastIndexOf Java :" + s1.lastIndexOf("Java"));

        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,8));
        System.out.println(s1.replace("Ja","En"));

        String s = "Java";
        System.out.println(s.matches("Java"));
        System.out.println(s.matches("JavaJava"));
        System.out.println(s.matches("java"));

        // 15-4
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<10000; i++){
            sb.append("Java");
        }
        s = sb.toString();

        // 15-7
        s = "abc,def:ghi";
        String[] words = s.split("[,:]");
        for (String w : words){
            System.out.print(w + "->");
        }
        System.out.println();

        // 15-8
        s = "abc,def:ghi";
        String w = s.replaceAll("[beh]","X");
        System.out.println(w);

        
        // 15-9
        System.out.println(String.format("製品番号%s-%02d", "SJV", 3));
        System.out.printf("製品番号%s-%02d", "SJV", 3);
        System.out.println();

        // 15-10
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        // 15-11
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);

        // 15-12
        Calendar c = Calendar.getInstance();
        c.set(2017,8,22,1,23,45);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);

        //Date now = new Date();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println(y);

        // 15-13
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d1 = f.parse("2020/09/22 01:23:45");
        System.out.println(d1);

        Date now2 = new Date();
        String ss = f.format(now2);
        System.out.println(ss);

    }
}