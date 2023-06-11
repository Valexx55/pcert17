package jcp17.records;

import java.text.*;
import java.util.Locale;
public record Bank(Locale locale) {
   public void printBalance(String v) throws ParseException {
      var n1 = NumberFormat.getCurrencyInstance(locale);
      var n2 = NumberFormat.getCurrencyInstance();
      var n3 = NumberFormat.getCompactNumberInstance();
      var value = n1.parse(v);
      //var value = NumberFormat.getCurrencyInstance().parse(v);
      System.out.println(n2.format(value));
      System.out.println(n3.format(n1.parse(v)));
   }
   public static void main(String[] ignore) throws Exception {
      new Bank(Locale.US).printBalance("$7000.30");
   } }
