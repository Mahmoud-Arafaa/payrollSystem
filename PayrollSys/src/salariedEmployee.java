public class salariedEmployee extends Employee implements Displayable{
	
	private double Salary;
	private double bonus ;
	private double deductions;
	public double getSalary() {
		return Salary;
	}
	public double getBonus() {
		return bonus;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	
	
	public salariedEmployee(){}
	
	
	
	
	public salariedEmployee(double salary, double bonus, double deductions,String name,int SSN,String Address,Gender Sex) {
		super(name , SSN , Address , Sex);
		Salary = salary;
		this.bonus = bonus;
		this.deductions = deductions;
	}
	@Override
	public double  Earning ()
	{
		return (Salary+bonus)-deductions;
	}
	
	public salariedEmployee(String name, int sSN, String address, Gender sex) {
		super(name, sSN, address, sex);
		// TODO Auto-generated constructor stub
	}
	public void DisplayAllDetails ()
	{
		
		System.out.println(super.toString());
		System.out.println(toString());
	}
	public void DisplayEarning ()
	{
		System.out.println(Earning());
	}
	
	@Override
	public String toString() {
		return "salariedEmployee [Salary=" + Salary + ", bonus=" + bonus + ", deductions=" + deductions + "]";
	}
	
	
	
	
	
	
	


}
