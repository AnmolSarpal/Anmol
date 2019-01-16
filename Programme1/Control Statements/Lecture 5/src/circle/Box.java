class Box{
	char w,h,d;
	int vol;
	double width;
	double height;
	double depth;
	Box(){
		width=1;
		height=2;
		depth=1;
	}
	Box(double w, double d){
		width=w;
		height=2;
		depth=d;
	}
	Box(double w, double d, double h){
		width=w;
		height=h;
		depth=d;
	}
	void setDim( float w, float h, float d){
		width = w ; height = h ; depth = d;
	}
	double Volume(){
		return height*width*depth;
	}
}