import java.util.Scanner;
class BoxWeightDemo{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of dimensions");
		Box obj1=new Box(10,10,10);
		obj1.CalVolume();
		int h=scan.nextInt();
		int w=scan.nextInt();
		int d=scan.nextInt();
		int wi=scan.nextInt();
	}
}