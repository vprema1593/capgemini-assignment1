package Employee;


public class Employee {
	protected int basic;
	float QA;
	float HRA;
	float Tax;
	int EPF;
	float NetSal;
	float Gross;
	float TaxVal;
	double overtime;
	double total;
void Netsalary()
{
		
}
void GrossSalary()
{
		
}
 void TaxPay()
 {
	 
 }
void OvertimePay()
{
	
}
void TotalPay()
{

}
void display()
{
	
}
}
class Manager extends Employee
{
	public void NetSalary()
	{
		NetSal=basic+(basic*20/200)+(basic*95/100)+1000;
	}
public void GrossSalary()
{
	Gross=basic+(basic*95/100)+(basic*25/100);	
}
public void TaxPay()
{
	TaxVal=(basic*25/100);
	}
public void TotalPay() {
	total=(Gross+NetSal+TaxVal);
}
public void display()
{
	System.out.println("the gross salary of manager:" +Gross);
	System.out.println("the net salary of manager:" +NetSal);
	System.out.println("the taxpay salary of manager:" +TaxVal);
	System.out.println("the total salary of manager:" +total);
	}
}
class Labour extends Employee
{
	public void NetSalary()
	{
		NetSal=basic+(basic*20/200)+(basic*95/100)+1000;
	}
	public void GrossSalary()
	{
		Gross=basic+(basic*95/100)+(basic*25/100);	
	}
	public void TaxPay()
	{
		TaxVal=(basic*25/100);
		} 
	public void OvertimePay()
	{
		overtime=(basic*12.00);
	}
	public void TotalPay() {
		total=(Gross+NetSal+TaxVal+overtime);
	}


	public void display()
	{
		System.out.println("the gross salary of labour:" +Gross);
		System.out.println("the net salary of labour:" +NetSal);
		System.out.println("the taxpay salary of labour:" +TaxVal);
		System.out.println("the overtimepay salary of labour:" +overtime);
		System.out.println("the total salary of labour:" +overtime);
		}


}
