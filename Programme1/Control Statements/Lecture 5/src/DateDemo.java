import java.util.Scanner;
class DateDemo{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		Date obj1=new Date();
		obj1.showcalDate();
		System.out.println("Enter the date,month and year");		
		int d=scan.nextInt();
		int m=scan.nextInt();
		int y=scan.nextInt();
		Date obj2=new Date(d,m,y);
		obj2.showcalDate();
	}
}