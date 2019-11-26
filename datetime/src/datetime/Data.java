package datetime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);int p,r;
		char ch;
		do
		{
			System.out.println("ENTER THE NAME");
			String name=s.next();
			System.out.println("ENTER THE ADDRESS");
			String ad=s.next();
			System.out.println("ENTER THE NO OF ROOM");
			int room=s.nextInt();
			System.out.println("ENTER THE NO OF PERSON");
		     p=s.nextInt();
			 r=room*3;
			int d=0,d1=0;
			if(r<=p)
			{
				 d=p-r;
				if(d<=3)
					d1=1;
				else
				d1=d/3;
				System.out.printf("INSUFFICIENT ROOM YOU WANT TO BOOK %d ROOMS\n",d1);
			}
			else
			{
				System.out.println("ENTER AC/NON");
				String ac=s.next();
				System.out.println("ENTER THE BOOKING DATE");
				String start =s.next();
				System.out.println("ENTER THE CHECKOUT DATE");
			    String end = s.next();
			    LocalDate ds = LocalDate.parse(start);
			    LocalDate de = LocalDate.parse(end);
			    long diff = ChronoUnit.DAYS.between(ds,de);
			    int tot=0,t=0,e=0;
			    
			    if(p%2!=0)
			    {
			    	e=p%2;
			    	
			    	tot=e*250;
			    }
			    tot=tot+((p-e)*500);
			    if(ac.equals("AC"))
			    {
			    int a=p*150;
			    tot=tot+a;
			    }
			    System.out.printf("NAME\n"+name);
				System.out.printf("\nADDRESS\n"+ad);
				System.out.printf("\nNO OF ROOMS\n"+room);
				System.out.printf("\nNO OF PERSONS\n"+p);
				System.out.printf("\nSTATUS OF AC/NON\n"+ac);
				System.out.printf("\nBOOKING DATE\n%s",start);
			 System.out.printf("\nCHECKOUT DATE\n %s",end);
				 tot=(int) (tot*diff);
				 System.out.printf("\nTOTAL AMOUNT %d", tot);
			    
			}
			
			System.out.println("\ndo you want to continue (y/n)");
			ch=s.next().charAt(0);
			if(ch=='n')
				System.exit(0);
		}while(r<=p||ch=='y');
	}

}
