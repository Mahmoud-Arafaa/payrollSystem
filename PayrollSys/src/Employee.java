enum Gender { male , female };
public abstract class Employee {
	
	private String name;
	private int SSN;
	private String Address ;
	Gender sex ;
	
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public abstract double  Earning ();
	
	public Employee() {}
	
	public Employee(String name, int sSN, String address, Gender sex) {
		
		this.name = name;
		SSN = sSN;
		Address = address;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", SSN=" + SSN + ", Address=" + Address + ", sex=" + sex + "]";
	}
	
	
	
	
	
	
	

}
