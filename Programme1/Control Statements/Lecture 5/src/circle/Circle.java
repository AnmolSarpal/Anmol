class Circle{
double radius;
double findArea(){
return radius * radius * 3.14;	
}
void displayArea(){
System.out.println("The area of the circle=" + findArea());
}
}