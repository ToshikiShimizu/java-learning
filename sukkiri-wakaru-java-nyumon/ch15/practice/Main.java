import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main{
    public static void main(String[] args){
        // 15-1
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<100; i++){
            sb.append(i+1+",");
        }
        System.out.println(sb);
        String[] a = sb.toString().split(",");
        System.out.println(a[0]);

        // 15-2
        System.out.println(concat("a","b"));

        // 15-3
        // .*
        // A\d{1,2}
        // U\[A-Z]{3}

        // 15-4
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_MONTH);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date future = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));

        // 15-5
        LocalDate nowTime = LocalDate.now();
        LocalDate futureTime = nowTime.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(futureTime.format(fmt));

    }

        
    public static String concat(String folder, String file){
        if (!folder.endsWith("\\")){
            folder += "\\";
        }
        return folder + file;
    }    
}