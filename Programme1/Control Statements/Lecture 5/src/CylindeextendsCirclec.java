class CylinderextendsCirclec{
	private double height;
	Cylinder(){
		super();
		this.height=1;
	}
	Cylinder(double radius){
		super(radius);
		this.height=1;
	}
	void setvalueheight(){
		super(radius);
		this.height=height;
	}
	void getvalueheight(){
		return height;
	}
	double calVolume(){
		double volume=super(radius) * super(radius) * double(height) * 3.14;
		return volume;
	}
}