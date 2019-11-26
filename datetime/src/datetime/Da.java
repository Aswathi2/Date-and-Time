package datetime;
import java.util.*;
public class Da {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar c = Calendar.getInstance(); 
		 System.out.println("present yr"+c.get(Calendar.YEAR));
		 System.out.println("present month "+c.get(Calendar.MONTH));
		 System.out.println("present yr"+c.get(Calendar.DATE));
		 c.add(Calendar.DATE,-7);
		 System.out.println("7 days ago "+c.getTime());
		 c.add(Calendar.YEAR,7);
		 System.out.println("after 7 years "+c.getTime());
		 c.add(Calendar.MONTH,7);
		 System.out.println("after 7 months "+c.getTime());
      
	}

}
