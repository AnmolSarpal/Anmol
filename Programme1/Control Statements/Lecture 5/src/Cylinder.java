class Cylinder extends Circlec{
	private double height;
	Cylinder(){
		super();
		this.height=1;
	}
	Cylinder(double height){
		super();
		this.height=1;
	}
	void setvalueheight(){
		super();
		this.height=height;
	}
	void getvalueheight(){
		
	}
	double calVolume(){
		double volume=radius*radius*(double)height * 3.14;
		return volume;
	}
}