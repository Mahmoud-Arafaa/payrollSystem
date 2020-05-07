import java.util.*; 

public class Department {

	private int dno;
	private String dname;
	ArrayList <Employee> emplist;
	
	public Department () {}

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
		emplist=new ArrayList<Employee>();
	}

	public int getDno() {
		return dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public void add_emp (Employee e)
	{
		emplist.add(e);
	}
	
	public void remove_emp (int index)
	{
		emplist.remove(index);
	}
	public int get_empcount ()
	{
		return emplist.size();
	}
	
	public void print_basic_data()
	{
		
		for(int i=0;i<emplist.size();i++)
		{
			System.out.println(emplist.get(i).getSSN()+" " + emplist.get(i).getName()+" "+ emplist.get(i).getAddress());
		}
	}
	
	public void Print_All_Details()
	{
		
		for(int i=0;i<emplist.size();i++)
		{
			if(emplist.get(i) instanceof salariedEmployee)
				((salariedEmployee) emplist.get(i)).DisplayAllDetails();
			
			if(emplist.get(i) instanceof HourlyEmployee)
				((HourlyEmployee) emplist.get(i)).DisplayAllDetails();
			
			if(emplist.get(i) instanceof CommissionEmployee)
				((CommissionEmployee) emplist.get(i)).DisplayAllDetails();
			
			if(emplist.get(i) instanceof BasepluscommissionEmployee)
				((BasepluscommissionEmployee) emplist.get(i)).DisplayAllDetails();
			
		}
		
		
	}
}