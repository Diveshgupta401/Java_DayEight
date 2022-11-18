package DayEight;

import java.util.Scanner;

public class Linecom {

	public Double makeLine(int x1,int x2,int y1,int y2)
	{
		@SuppressWarnings("removal")
		Double l = new Double( Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		return l;
	}
	
	public void compareLines(Double l1,Double l2)
	{
		if(l1.compareTo(l2) == 0)
			System.out.println("L1 and L2 are equal");
		else
			System.out.println("L1 and L2 are not equal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linecom lc = new Linecom();
		System.out.println("Welcome to Line Comparison Computation Program!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting x co-ordinate for first line");
		int x1 = sc.nextInt();
		System.out.println("Enter starting y co-ordinate for first line");
		int y1 = sc.nextInt();
		System.out.println("Enter end x co-ordinate for first line");
		int x2 = sc.nextInt();
		System.out.println("Enter end y co-ordinate for first line");
		int y2 = sc.nextInt();
		Double l1 = lc.makeLine(x1,x2,y1,y2);
		
		System.out.println("Length of line is "+ l1);
		
		System.out.println("Enter starting x co-ordinate for second line");
		int x3 = sc.nextInt();
		System.out.println("Enter starting y co-ordinate for second line");
		int y3 = sc.nextInt();
		System.out.println("Enter end x co-ordinate for second line");
		int x4 = sc.nextInt();
		System.out.println("Enter end y co-ordinate for second line");
		int y4 = sc.nextInt();
		Double l2 = lc.makeLine(x3,x4,y3,y4);
		
		lc.compareLines(l1, l2);
		
		sc.close();
	}

}
