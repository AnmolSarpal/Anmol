class BoxDemo
{
	public static void main(String[]args)
	{
		Box obj1=new Box();
		double vol1=obj1.volume();
		System.out.println("Non parametric constructor" +vol1);
		Box obj2=new Box(1,3);
		double vol2=obj2.volume();
		System.out.println("Non parametric constructor" +vol2);
		Box obj2=new Box();
		double vol3=obj3.volume();
		System.out.println("Parametric constructor" +vol3);
	}
}