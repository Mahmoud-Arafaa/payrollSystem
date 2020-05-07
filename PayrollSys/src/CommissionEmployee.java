public class CommissionEmployee extends Employee implements Displayable{
	
	public double Gross_sales ;
	public double Commission_rate;
	public double getGross_sales() {
		return Gross_sales;
	}
	public double getCommission_rate() {
		return Commission_rate;
	}
	public void setGross_sales(double gross_sales) {
		Gross_sales = gross_sales;
	}
	public void setCommission_rate(double commission_rate) {
		Commission_rate = commission_rate;
	}
	
	public CommissionEmployee() {}
	public CommissionEmployee(double gross_sales, double commission_rate,String name,int SSN,String Address,Gender Sex) {
		super(name , SSN , Address , Sex);
		Gross_sales = gross_sales;
		Commission_rate = commission_rate;
	}
	@Override
	public String toString() {
		return "CommissionEmployee [Gross_sales=" + Gross_sales + ", Commission_rate=" + Commission_rate + "]";
	}
	
	@Override
	public double  Earning ()
	{
		return Gross_sales*Commission_rate;
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
