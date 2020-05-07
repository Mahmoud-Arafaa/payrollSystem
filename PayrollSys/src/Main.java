public class Main {

	public static void main (String []args)
	{
		Department d = new Department (1 , "Information System");
		salariedEmployee s = new salariedEmployee (2000,500,50,"Ahmed",111,"Giza",Gender.male);
		
		d.add_emp(s);
		
		HourlyEmployee h = new HourlyEmployee (2000,500,"sara",222,"cairo",Gender.female);
		
		d.add_emp(h);
		
		CommissionEmployee c = new CommissionEmployee (33.5,52.25,"yara",101,"Haram",Gender.female);
		
		d.add_emp(c);
		
		
		System.out.println(d.get_empcount());
		
		d.print_basic_data();
		
		d.Print_All_Details();
		
		
		
		
	}
}
