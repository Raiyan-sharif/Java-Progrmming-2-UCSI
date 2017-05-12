class Staff{
	private String name;
	private String department;
	private double salary;
	public Staff(){
		this.name="";
		this.department="";
		this.salary=0.0;
	}
	public Staff(String name,String department,double salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDepartment(String department){
		this.department = department;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getName(){
		return this.name;
	}
	public String getDepartment(){
		return this.department;
	}
	public double getSalary(){
		return this.salary;
	}
	
	
}
public class TestStaff{
	public static void main(String[] agrs){
		Staff s = new Staff("Raiyan","IT",300.0);
		System.out.println("Name: "+s.getName());
		System.out.println("Departement: "+s.getDepartment());
		System.out.println("Salary: "+s.getSalary());
		
	}
}