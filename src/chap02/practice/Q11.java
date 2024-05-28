package chap02.practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q11 {
    static class YMD {
        int y; //년
        int m; //월
        int d; //일

        public YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        public String after(int n) throws ParseException {
            String date_str = this.y + "-" + this.m + "-" + this.d;
            SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
            Date date = form.parse(date_str);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date);
            cal1.add(Calendar.DATE, n);
            Date newDate = new Date(cal1.getTimeInMillis());
            return form.format(newDate);
        }

        public String before(int n) throws ParseException {
            String date_str = this.y + "-" + this.m + "-" + this.d;
            SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
            Date date = form.parse(date_str);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date);
            cal1.add(Calendar.DATE, n * (-1));
            Date newDate = new Date(cal1.getTimeInMillis());
            return form.format(newDate);
        }
    }

    public static void main(String[] args) throws ParseException {
        YMD ymd = new YMD(2024,5,28);
        System.out.println(ymd.after(1));
        System.out.println(ymd.before(1));
    }
}
