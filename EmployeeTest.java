
import java.util.Scanner;

class Employee
{
	String first_name;
	String last_name;
	float salary;
	
	Employee()
	{
		first_name=" ";
		last_name=" ";
		salary=0;
	}
	void setFname(String first_name)
	{
		this.first_name=first_name;
	}
	void setLname(String last_name)
	{
		this.last_name=last_name;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	String getFname()
	{
		return first_name;
	}
	String getLname()
	{
		return last_name;
	}
	float getSalary()
	{
		return salary;
	}
}
public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First name:");
		String fn=sc.nextLine();
		System.out.println("Enter the Last name:");
		String ln=sc.next();
		System.out.println("Enter the salary:");
		float s=sc.nextFloat();
		float r=s/10;
		
		Employee e=new Employee();
		e.setFname(fn);
		e.setLname(ln);
		e.setSalary(s+r);
		
		System.out.println("Display the information of Employee:");
		System.out.println("The Employee first name is="+e.getFname());
		System.out.println("The Employee last name is="+e.getLname());
		System.out.println("The Employee Salary after raise by 10% ="+e.getSalary());
		
	}

}
