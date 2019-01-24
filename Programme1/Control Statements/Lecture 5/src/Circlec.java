class Circlec{
	private double radius;
	private String color;
	Circlec(){
		this.radius=1;
		this.color="red";
	}
	Circlec(double radius){
		this.radius=radius;
		this.color="red";
	}
	Circlec(String color){
		this.radius=1;
		this.color=color;
	}
	void setvalueradius(double radius){
		this.radius=radius;
		this.color="red";
	}
	void setvaluecolor(String color){
		this.color=color;
		this.radius=1;
	}
	double getvalueradius(){
		return radius;
	}
	String getvaluecolor(){
		return color;
	}
	double calculateArea(){
		double area=(double) radius * radius * 3.14;
		return area;
	}
}