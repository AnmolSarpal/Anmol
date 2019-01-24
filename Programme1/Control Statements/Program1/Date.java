class Date
{
int d, m, y
double date;
double month;
double year;
Date(){
	date=1;
	month=1;
	year=2000
}
Date(double d,double m,double y){
	date=d;
	month=m;
	year=y;
}
double CalDate(){
	return date/month/year
}
}