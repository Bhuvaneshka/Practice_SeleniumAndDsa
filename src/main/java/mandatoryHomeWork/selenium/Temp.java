package mandatoryHomeWork.selenium;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Temp {
	public static void main(String[] args) {
//		LocalTime lt = new LocalTime();
//		System.out.println(lt);
//		
//		LocalTime plusMinutes = lt.plusMinutes(45);
//		System.out.println(plusMinutes);
//		
//		String addedTime = plusMinutes.toString();
//		String[] split = addedTime.split(":");
//		
//		System.out.println(split[0]+""+split[1]);
//		
//		int mins = Integer.parseInt(split[1]);
//		int hour = Integer.parseInt(split[0]);
//
//		System.out.println(hour);
//		System.out.println(mins);
//		int tempHr = 0;
//		long tempMin = 0;
//		if(mins> 30)
//		{
//			
//			tempHr = hour+1;
//			tempMin = 00;
//			
//		}
//		else {
//			tempHr = hour;
//			tempMin = 30;
//			//tempMin = 00;
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(tempHr+":"+tempMin);
//		System.out.println(sb.toString());
//	
		
		
LocalDateTime now = LocalDateTime.now();
        
        // Extract the date and hour
        String date = now.format(DateTimeFormatter.ISO_DATE);
        String hour = String.format("%02d", now.getHour());
        
        // Print the result
        System.out.println("Date: " + date);
        System.out.println("Hour: " + hour);
    }
    }
