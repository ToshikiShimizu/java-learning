import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args){
        // 15-15
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(z1);
        System.out.println(l3);
        
        // 15-16
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println(str);

        LocalDate now = LocalDate.now();
        if (now.isAfter(ldatep)){
            System.out.println("1000");
        }

        // 15-17
        LocalDate d1 = LocalDate.of(2020,1,1);
        LocalDate d2 = LocalDate.of(2020,1,4);

        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d1, d2);

        LocalDate d3 = d2.plus(p2);
    }
}
