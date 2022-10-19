// Interface code
import java.time.LocalDate;
import java.util.*;
class Person
{
	String name;
	int birthdate;
	int height;
	int weight;
	int address;
	int day,mon,year;
	
	Person(String name,int d,int m,int y,int h,int w)
	{
		this.name=name;
		day=d;
		mon=m;
		year=y;
		height=h;
		weight=w;
	}
	int getYear()
	{
		return year;
	}
	int getMon()
	{
		return mon;
	}
	int getDay()
	{
		return day;
	}
	int calculateAge()
	{
		LocalDate myobj=LocalDate.now();
		int age=myobj.getYear()-year;
		return age;
	}
	
}
class Student extends Person
{ 
   	int rollno;
	//int marks[]=new int[5];
	float avg;
	int sum=0;
	Student(String name,int d,int m,int y,int h,int w,int rollno)
	{
	super(name,d,m,y,h,w);
	this.rollno=rollno;
   	}
	void calculateAvg()
	{
	int[] marks=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Students marks:");
	for(int i=0;i<marks.length;i++)
	{
		 marks[i]=sc.nextInt();
	}
	for(int i=0;i<marks.length;i++)
	{
	sum=sum+marks[i];
	}
	avg=sum/5;
	System.out.println("The Average of marks is="+avg);
	}
}
class Employee extends Student
{
	int empID;
	double salary;
	Employee(String name,int d,int m,int y,int h,int w,int rollno,int empID,double salary)
	{
		super(name,d,m,y,h,w,rollno);
		this.empID=empID;
		this.salary=salary;
	}
	void employeeTax()
	{
	double tax=0.0;
        double tax_amount = 0.0;
        if ((salary > 10000) && (salary < 15000)) 
        {
            tax = 0.4 * salary;
        }  
        else if ((salary >= 15000) && (salary < 20000)) 
        {
            tax = 0.06;
            tax_amount = 0.06 * salary;
        }
        else if ((salary >= 20000) && (salary < 25000))
        {
            tax = 0.8;
            tax_amount = 0.08 * salary;
        } 
        else if ((salary >= 25000) && (salary < 30000))
        {
            tax = 0.10;
            tax_amount = 0.10 * salary;
        }
        else if (salary >= 30000)
        {
            tax = 0.12;
            tax_amount = 0.12 * salary;
        }
        System.out.println("The income tax to be deducted from the salary is: " + tax + "%");
	System.out.println("Total inhand salary is="+tax_amount);
    }
	void display()
	{
		System.out.println("The name is="+name);
		System.out.println("The date of birth is is="+getDay()+"/"+getMon()+"/"+getYear());
		System.out.println("The age of person is="+super.calculateAge());
		System.out.println("The height is="+height);
		System.out.println("The weight is="+weight);
		System.out.println("The roll no of student is:"+rollno);
		System.out.println("The ID of employee is="+empID);
		System.out.println("The salary of employee is="+salary);
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	String n=sc.nextLine();
	System.out.println("Enter the day of birth:");
	int d=sc.nextInt();
	System.out.println("Enter the month of birth:");
	int m=sc.nextInt();
	System.out.println("Enter the year of birth:");
	int y=sc.nextInt();
	System.out.println("Enter the height:");
	int h=sc.nextInt();
	System.out.println("Enter the weight:");
	int w=sc.nextInt();
	System.out.println("Enter the Roll No of Student:");
	int r=sc.nextInt();
	System.out.println("Enter the Employee ID:");
	int Id=sc.nextInt();
	System.out.println("Enter the salary of employee:");
	float s=sc.nextFloat();
	Employee obj=new Employee(n,d,m,y,h,w,r,Id,s);
	obj.display();
	obj.calculateAvg();
	obj.employeeTax();

	}
	
}
	
	
