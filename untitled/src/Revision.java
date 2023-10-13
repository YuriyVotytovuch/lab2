import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;

public class Revision {
    Date currentdate = new Date();
    SimpleDateFormat dateformat = new SimpleDateFormat();
    String date;
    int lack;
    int overstatement;
    public Revision(String d, int l, int ot){
        this.date=d;
        this.lack=l;
        this.overstatement=ot;
    }
    void info(){
        System.out.println("Дата останньої ревізії: "+date);
        System.out.println("Недостача: "+lack);
        System.out.println("Перезбуток: "+overstatement);
    }
    String nextrev(){
        //int l=currentdate.getDay();
        //int b=currentdate.getMonth();
        //int c=currentdate.getYear();
        int l=currentdate.getDate()+7;
        int b=currentdate.getMonth()+1;
        int c= Calendar.getInstance().get(Calendar.YEAR);
        String a=l+"."+b+"."+c;
        return a;
    }
}
