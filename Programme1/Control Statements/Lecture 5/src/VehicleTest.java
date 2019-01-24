import java.util.Scanner;
class VehicleTest{
	public static void main(String[]args){
		System.out.println("Enter the number of tyres in the vehicle");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		switch(num)
		{
			case 2:Bike b=new Bike();
			b.display();//
			break;
			case 4:Car c=new Car();
			c.display();
			break;
			default:Vehicle v=new Vehicle();
			v.display();
			break;
		}
	}
}