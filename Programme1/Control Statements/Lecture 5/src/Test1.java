class Test1{
	int a;
	Test1(int i){
		a=i;		
	}
	Test1 incrByTen(){
		Test temp=new Test(a+10);
		return temp;
	}
}