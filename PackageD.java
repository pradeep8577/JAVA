import mymath.*;
import java.util.*;
public class PackageD
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int x=sc.nextInt();
	System.out.println("Enter the value of b:");
	int y=sc.nextInt();
	System.out.println("Enter the angle in degree:");
	double deg=sc.nextDouble();
	Arithmetic A=new Arithmetic(x,y);
	Trig T=new Trig(deg);
	while(true)
	{
	int ch;
	System.out.println("1.Arithmetic");
	System.out.println("2.Trignometric");
	System.out.println("3.Quit");
	System.out.println();
	System.out.println("Enter the choice:");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:A.Addition();
		A.Subtraction();
		A.Multiplication();
		A.Division();
		break;
	case 2:T.sinetorad();
		T.cosinetorad();
		T.tantorad();
		T.cottorad();
		T.cosectorad();
		T.sectorad();
		break;
	case 3:System.exit(0);
	default:System.out.println("Invalid choice");
  
      }
    }
  }
}
