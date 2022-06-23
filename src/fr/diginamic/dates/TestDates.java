package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = d1.format(today);
        System.out.println("Today is : " + date1);
		
		Date date = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date2 = d2.format(date);
        System.out.println("Created date " + date2);
	}

}
