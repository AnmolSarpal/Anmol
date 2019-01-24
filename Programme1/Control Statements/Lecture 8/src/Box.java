class Box{
	int h,d,w;
	float height;
	float depth;
	float width;
	float weight;
	Box(){
		height=1;
		depth=1;
		width=1;
	}	
	Box(float height,float width,float depth){
		height=h;
		width=w;
		depth=d;
	}
	void setvalue(float height,float width,float depth){
		this.height=height;
		this.depth=depth;
		this.width=width;
	}
	void getvalue(){
		System.out.println("The enterd values of the variablees are "+height +depth +width);
	}
	float CalVolume(){
		float volume= height*width*depth;
		return volume;
	}
}