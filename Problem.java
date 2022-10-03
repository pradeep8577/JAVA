import java.util.*;
class StudentInfo
{
	private int studentID;
	private String studentName;
	StudentInfo(int studentID,String studentName)
	{
	this.studentID=studentID;
	this.studentName=studentName;
	}
	int getId()
	{
	return studentID;
	}
	String getName()
	{
	return studentName;
	}
}
class StudentMarks extends StudentInfo
{
	private int marks1,marks2,marks3;
	StudentMarks(int studentID,String studentName,int marks1,int marks2,int marks3)
	{
	super(studentID,studentName);
	this.marks1=marks1;
	this.marks2=marks2;
	this.marks3=marks3;
	}	
	int getmarks1()
	{
	return marks1;
	}
	int getmarks2()
	{
	return marks2;
	}
	int getmarks3()
	{
	return marks3;
         }
}
class StudentResult extends StudentMarks
{
	private int totalMarks=0;
	StudentResult(int studentID,String studentName,int marks1,int marks2,int marks3)
	{
	super(studentID,studentName,marks1,marks2,marks3);
	}
	public void calculateTotalmarks()
	{
	totalMarks=super.getmarks1()+super.getmarks2()+super.getmarks3();
	System.out.println("The total marks is="+totalMarks);
	}  
	int gettotalM()
	{
	return totalMarks;
	}	               
	void display()
	{
	System.out.println("The student id is:"+super.getId());
	System.out.println("The student Name is:"+super.getName());
	System.out.println("The marks1="+super.getmarks1());	
	System.out.println("The marks2="+super.getmarks2());
	System.out.println("The marks3="+super.getmarks3());
	}
}
class Test
{
	public static void main(String[] args)
	{
	
	StudentResult obj=new StudentResult(1,"Saad",78,77,67);
	StudentResult obj1=new StudentResult(2,"Kedar",87,67,99);
	StudentResult obj2=new StudentResult(3,"pradeep",67,71,80);
	System.out.println("First Student Information:");
	obj.display();
	obj.calculateTotalmarks();
	System.out.println();

	System.out.println("Second Student Information:");
	obj1.display();
	obj1.calculateTotalmarks();
	System.out.println();

	System.out.println("Third Student Information:");
	obj2.display();
	obj2.calculateTotalmarks();
	System.out.println("----------------------------------------------------");
	if(obj.gettotalM()> obj1.gettotalM() && obj.gettotalM()>obj2.gettotalM())	
	{
	
	System.out.println("The topper is:"+obj.getId());
	System.out.println("The student Name is:"+obj.getName());
	System.out.println("The total marks is="+obj.gettotalM());
	}
	else if(obj1.gettotalM()> obj.gettotalM() && obj1.gettotalM()>obj2.gettotalM())
	{
	System.out.println("The topper is:"+obj1.getId());
	System.out.println("The student Name is:"+obj1.getName());
	System.out.println("The total marks is="+obj1.gettotalM());
	}
	else
	{
	System.out.println("The topper is:"+obj2.getId());
	System.out.println("The student Name is:"+obj2.getName());
	System.out.println("The total marks is="+obj2.gettotalM());
	
	}
	}
}
	

	
	