package DayEight;

import java.util.Random;

public class EmpyeeEage {

	int prtHours = 4;
	int fullHours = 8;
	int wagePerHour = 20;
	
	public boolean isEmployeePresent(int p)
	{
		if(p == 1 || p == 2)
			return true;
		else
			return false;
	}
	
	public int calculateWage(int p)
	{
		int wage = 0;
		if(isEmployeePresent(p))
		{
			if(p == 2)
				wage = wagePerHour*prtHours;
			else
				wage = wagePerHour*fullHours;
		}
		else
			wage = 20*0;
			
		return wage;
	}
	
	
	public int calculateMonthlyWage(int p)
	{
		int wage = 0;
		if(isEmployeePresent(p))
		{
			if(p == 2)
				wage = 20*wagePerHour*prtHours;
			else
				wage = 20*wagePerHour*fullHours;
		}
		else
			wage = 20*wagePerHour*0;
			
		return wage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			System.out.println("Welcome to employee wage computaion program!");
			Random rnd = new Random();
			int dayCount = 0;
			int hrs = 0;
			int wage = 0;
			EmpyeeEage emp = new EmpyeeEage();
//			if(emp.isEmployeePresent(p))
//				System.out.println("Employee is present!");
//			else
//				System.out.println("Employee is absent!");
//			
//			if(p == 2)
//				System.out.println("Employee is part time");
//			else
//				System.out.println("Employee is full time");
//			
//			int wage = emp.calculateWage(p);
//			System.out.println("Employee wage is " + wage);
			
			while(!(dayCount >= 20 || hrs >= 100))
			{
				int p = rnd.nextInt(3);
				dayCount++;
				switch(p)
				{
				case 0: System.out.println("Employee is absent");
				  		System.out.println("Employee daily wage is " + emp.calculateWage(0));
				  		hrs += 0;
				  		wage += 0; 
				  		break;
				case 1: System.out.println("Employee is present full time");
		  				System.out.println("Employee daily wage is " + emp.calculateWage(1));
		  				hrs += 8;
		  				wage += 20*8;
		  				break;
				case 2:System.out.println("Employee is present part time");
		  				System.out.println("Employee daily wage is " + emp.calculateWage(2));
		  				hrs += 4;
		  				wage += 20*4;
		  				break;
		  		default:break;
				}
				
			}
			
			System.out.println("Total wage for "+ dayCount + " days and "+ hrs + " hours is "+wage);
			

	}
}
