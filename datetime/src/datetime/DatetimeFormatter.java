package datetime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DatetimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalDateTime dt=LocalDateTime.now();
			System.out.println("BEFORE FORMATTING"+dt+"\n");
			//DateTimeFormatter is the class name and f is the object
			DateTimeFormatter f=DateTimeFormatter.ofPattern("E,yyyy/mm/dd hh:mm:ss");
			String d=dt.format(f);
			System.out.print("AFTER FORMATTING:"+d);
	}

}
