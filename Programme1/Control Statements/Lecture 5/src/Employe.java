class Employe{
	String firstname;
	String lastname;
	double salary;
	Employe(){
		firstname=Gurpreet;
		lastname=Kappa;
		salary=1000;
	}
	Employe(tring f,string l,double s){
		firstname=f;
		lastname=l;
		salary=s;
	}
	double yearsal(){
		yaersal=12 * this.salary;
		return (yearsal);
	}
	double salRaise(){
		return(0.1*this.yearsal+this.yearsal);
	}
	void display(){
		System.out.println("The details of the employee are" + Employe()+"The yearly salary of the employee is" + yearsal()+"The rise in the salary of the employee"+salRaise());
	}
}