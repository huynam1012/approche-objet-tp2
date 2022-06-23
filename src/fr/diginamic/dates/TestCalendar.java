package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, 4, 19, 23, 59, 30);
        Date calendarDate1 = calendar1.getTime();
        String date1 = d1.format(calendarDate1);
        System.out.println("Created date : " + date1);
        
        SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar2 = Calendar.getInstance();
        Date calendarDate2 = calendar2.getTime();
        String date2 = d2.format(calendarDate2);
        System.out.println("Today is : " + date2);
        
        SimpleDateFormat d3 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        String date3 = d3.format(calendarDate2);
        System.out.println("Date du jour en francais : " + date3);
        
        SimpleDateFormat d4 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        String date4 = d4.format(calendarDate2);
        System.out.println("Date du jour en chinois : " + date4);
        
        SimpleDateFormat d5 = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
        String date5 = d5.format(calendarDate2);
        System.out.println("Date du jour en russe : " + date5);
        


	}

}
