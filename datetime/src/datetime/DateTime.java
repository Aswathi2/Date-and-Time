package datetime;
import java.time.*;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current date
System.out.println("TODAY DATE");
LocalDate date=LocalDate.now();//date is the object name
System.out.println(date);
System.out.println();
//current time
System.out.println("CURRENT TIME");
LocalTime time=LocalTime.now();//time is the name of object
System.out.println(time);
System.out.println();
//current date &time
System.out.println("CURRENT DATE & TIME");


LocalDateTime dt=LocalDateTime.now();//localDateTime is the class name&dt object                                      
System.out.println(dt);
	}

}
