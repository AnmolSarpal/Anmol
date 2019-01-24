class BoxWeight extends Box{
	int wi;
	BoxWeight(){
		weight=1;
	}
	BoxWeight(float weight){
		weight=wi;
	}
	void setvalue(float weight){
		this.weight=weight;
	}
	void getvalue(){
		System.out.println("The value entered for the weight of the box is" +weight);
	}
}