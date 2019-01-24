import java.util.Scanner;
class DateDemo{
	public static void main(String[]args){
		Date obj1=new Date();
		obj1.showCalDate();
		System.out.println("Enter the date,month and year");
		Scanner Input=new Scanner (System.in);
		int d=scan.nextInt();
		int m=scan.nextInt();
		int y=scan.nextInt();
		Date obj2=new Date(d,m,y);
		obj2.showCalDate()
	}
}