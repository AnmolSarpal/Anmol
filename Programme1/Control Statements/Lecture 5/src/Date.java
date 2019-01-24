class Date
{
int d, m, y;
double date;
double month;
double year;
Date(){
	date=1;
	month=1;
	year=2000;
}
Date(double d,double m,double y){
	date=d;
	month=m;
	year=y;
}/*
void calDate(){
    System.out.println(date+"//" + month+"//" + year);
}*/
void showcalDate(){
	System.out.println("The Date of birth is" + date+"//" + month+"//" + year );

}
}