class TestDemo{
	public static void main(String[]args){
		Test ob =new Test();
		System.out.println("ob.a and ob.b before call:" +ob.a + " "+ ob.b);
		ob.meth(15,20);
		System.out.println("ob.a and ob.b after call:" +ob.a +" "+ ob.b);
	}
}