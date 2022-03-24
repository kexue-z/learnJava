import java.util.Date;
import java.util.*;
import java.text.*;

public class Test {
   public static void main(String[] args) {
      // dateFormat(args.length == 0 ? "1919-01-01" : args[0]);
      sleep(args.length == 0 ? 0 : Integer.parseInt(args[0]));
   }

   static void test() {
      System.out.println("Hello World!");
   }

   public static Date DateTest() {
      Date date = new Date();
      // System.out.println(date);
      return date;

   }

   static void printDate(Date date) {
      String str = String.format(Locale.US, "英文月份简称：%tb", date);
      System.out.println(str);
   }

   static void chengfabiao() {
      // 乘法表
      for (int i = 1; i <= 9; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(j + "*" + i + "=" + i * j + "  ");
            if (i == j) {
               System.out.println();
            }
         }
      }
   }

   static void dateFormat(String date) {
      SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
      String input = date.length() == 0 ? "1818-11-11" : date;
      Date t;
      try {
         t = ft.parse(input);
         // System.out.println(t);
         System.out.println(input + " Parses as " + t);
      } catch (ParseException e) {
         System.out.println("Unparseable using " + ft);
      }
   }

   static void sleep(int sleep) {
      // 123123
      try {
         System.out.println("sleep " + sleep + " seconds");
         Thread.sleep(sleep * 1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      } catch (Exception e) {
         System.out.println("Got an exception!");
      }
   }
}
