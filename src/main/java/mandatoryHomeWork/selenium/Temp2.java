package mandatoryHomeWork.selenium;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Temp2 {
	public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and hour in 12-hour format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        String formattedDateTime = now.format(formatter);

        // Extract the date and hour
        String date = formattedDateTime.substring(0, 10);
        String hour = formattedDateTime.substring(11, 13);
        String mins = formattedDateTime.substring(14, 16);

        // Print the result
        System.out.println("Date: " + date);
        System.out.println("Hour: " + hour);
        System.out.println("mins: " + mins);
        
        int mins1 = Integer.parseInt(mins);
		int hour1 = Integer.parseInt(hour);
        
        int tempHr = 0;
		long tempMin = 0;
		if(mins1> 30)
		{
			tempHr = hour1+1;
			tempMin = 00;
		}
		else {
			tempHr = hour1;
			tempMin = 30;
			//tempMin = 00;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(tempHr+":"+tempMin);
		System.out.println(sb.toString());
    }
}
