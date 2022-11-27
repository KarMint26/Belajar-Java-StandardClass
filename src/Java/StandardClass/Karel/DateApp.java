package Java.StandardClass.Karel;

import java.sql.Date;
import java.util.Calendar;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date(1669586912000L);

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 20);

        java.util.Date myBirthday = calendar.getTime();
        System.out.println(myBirthday);

    }
}
