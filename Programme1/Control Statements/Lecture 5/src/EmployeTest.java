import java.util.Scanner;
class EmployeTest{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		Employe obj1=new Employe();
		obj1.Display();
		System.out.println("Enter the first name, last name,and salary");
		char f=scan.nextChar();
		char l=scan.nextChar();
		int s=scan.nextInt();
		Employe obj2=new Employe();
		obj2.Display();
	}
}