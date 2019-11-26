package datetime;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		String name=s.next();
		System.out.println("ENTER THE ADDRESS");
		String ad=s.next();
		System.out.println("ENTER THE NO OF ROOM");
		int room=s.nextInt();
		System.out.println("ENTER THE NO OF PERSON");
		int p=s.nextInt();
		System.out.println("ENTER AC/NON");
		String ac=s.next();
		System.out.println("ENTER THE BOOKING DATE");
		String start =s.next();
		System.out.println("ENTER THE CHECKOUT DATE");
	    String end = s.next();
	    LocalDate ds = LocalDate.parse(start);
	    LocalDate de = LocalDate.parse(end);
	    long diff = ChronoUnit.DAYS.between(ds,de);
		int tot=0,p1=500,t=0;
		int r=2*p;
		if(p%2==0)
			tot=p*p1;
		else
		{	
			tot=(p-1)*p1;
			tot=tot+250;
		}
		if(ac=="AC")
		{
			t=room+150;
			tot=tot+t;
		}
		System.out.printf("NAME\n",name);
		System.out.printf("ADDRESS\n",ad);
		System.out.printf("NO OF ROOMS\n",room);
		System.out.printf("NO OF PERSONS\n",p);
		System.out.printf("STATUS OF AC/NON\n",ac);
		System.out.printf("BOOKING DATE\n%s",start);
	 System.out.printf("\nCHECKOUT DATE\n %s",end);
		 tot=(int) (tot*diff);
		 if(3*room>=p)
		   System.out.printf("\nTOTAL AMOUNT IS %d",tot);
		 else
			 System.out.printf("\ninsufficient room");

	}

}
