public class HourlyEmployee extends Employee implements Displayable{
	
	private double Hour_rate ;
	private int Number_of_hour;
	public double getHour_rate() {
		return Hour_rate;
	}
	public int getNumber_of_hour() {
		return Number_of_hour;
	}
	public void setHour_rate(double hour_rate) {
		Hour_rate = hour_rate;
	}
	public void setNumber_of_hour(int number_of_hour) {
		Number_of_hour = number_of_hour;
	}
	
	public HourlyEmployee() {}
	public HourlyEmployee(double hour_rate, int number_of_hour,String name,int SSN,String Address,Gender Sex) {
		super(name,SSN,Address,Sex);
		Hour_rate = hour_rate;
		Number_of_hour = number_of_hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [Hour_rate=" + Hour_rate + ", Number_of_hour=" + Number_of_hour + "]";
	}
	
	@Override
	public double  Earning ()
	{
		return Hour_rate*Number_of_hour;
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
