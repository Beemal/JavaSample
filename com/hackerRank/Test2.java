package com.hackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      double payment = scanner.nextDouble();
      scanner.close();

      // Write your code here.
     
      Locale uslocale = Locale.US;
	NumberFormat usformat = NumberFormat.getCurrencyInstance(uslocale);
  Locale chlocale = Locale.CHINA;
NumberFormat chformat=NumberFormat.getCurrencyInstance(chlocale);
  Locale frlocale = Locale.FRANCE;
NumberFormat frformat=NumberFormat.getCurrencyInstance(frlocale);

NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

String moneyStringIN = formatter.format(payment);
String moneyStringUS = usformat.format(payment);
String moneyStringCH = chformat.format(payment);
String moneyStringFR = frformat.format(payment);

System.out.println("US:"+moneyStringUS);
System.out.println("India:"+moneyStringIN);
System.out.println("China:"+moneyStringCH);
System.out.println("France:"+moneyStringFR);
  }
}
