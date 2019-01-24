class Point{
	private float=x;
	private float=y;
	Point(){
		this.x=0;
		this.y=0;
	}
	Point(float x,float y){
		this.x=x1;
		this.y=y1;
	}
	void setvaluex(float x){
		this.x=x;
	}
	void setvaluey(float y){
		this.y=y;
	}
	float getvaluex(){
		return x;
	}
	float getvalue(){
		return y;
	}
	float calculateDistance(Point p2){
		float dist = (float) Math.sqrt(Math.pow((getValuex()-p2.getvaluex()),2)
		Math.pow((getValuey()-p2.getvaluey()),2));
		return dist;
	}
}