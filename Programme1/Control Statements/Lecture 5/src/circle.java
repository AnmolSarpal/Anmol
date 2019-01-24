class circle{
	private float rad;
	public setradius(float radius)
	{
		this.rad=radius;
	} 
	public float getradius(){
		return rad;
	}
	public float findArea(circle c){
		return(3.14*(c.getradius)*(c.getradius));
	}
	public void displayArea(){
		System.out.println("The area of the circle is " + findArea());
	}
}