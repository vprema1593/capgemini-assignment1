package collections;
public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String email;
	double Salary;
	public Employee(int id,String name,String email,double Salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.Salary=Salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	
	public void display()
	{
		System.out.println("id:"+getId()+"name:"+getName()+"email:"+getEmail()+"salary"+getSalary());
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}



