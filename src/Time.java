import java.util.*;
import java.io.*;
class Time
{
    static void time()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l;
        Calendar cal = Calendar.getInstance();//to create an object of Calender

        // Data members of calender classYEAR, MONTH, DAY_OF_MONTH,

        int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH);      // 0 to 11
      int day = cal.get(Calendar.DAY_OF_MONTH);// 1 to 31
      int hour = cal.get(Calendar.HOUR_OF_DAY);//0 to 23
      int minute = cal.get(Calendar.MINUTE);// 0 to 59
      int second = cal.get(Calendar.SECOND);// 0 to 59
      int mill=cal.get(Calendar.MILLISECOND);//0 to 599
      System.out.println(day+"|"+month+"|"+year);
      System.out.println(hour+"HR:"+minute+"Min:"+second+"s:"+mill+":millis second");
    }
}  