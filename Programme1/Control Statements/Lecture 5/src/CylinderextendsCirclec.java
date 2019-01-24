class CylinderextendsCirclec{
	private double height;
	CylinderextendsCirclec(){
		super();
		this.height=1;
	}
	CylinderextendsCirclec(double height){
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
		double volume=super(radius) * super(radius) * (double)height * 3.14;
		return volume;
	}
}