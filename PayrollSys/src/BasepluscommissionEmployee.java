public class BasepluscommissionEmployee extends CommissionEmployee{
	public double Base;

	
	public void setBase(double base) {
		Base = base;
	}
	public double getBase() {
		return Base;
	}
	public BasepluscommissionEmployee() {}
	public BasepluscommissionEmployee(double base) {
		//super(name,SSN,Address,Sex);
		Base = base;
	}
	
	@Override
	public double  Earning ()
	{
		return Base + super.Earning();
	}
	@Override
	public String toString() {
		return "BasepluscommissionEmployee [Base=" + Base + "]";
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
	
	
	
	
	
	
	
	

}
