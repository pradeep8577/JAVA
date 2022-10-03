package mymath;
import java.lang.Math;
public class Trig
{
	double degree;
	public Trig(double degree)
	{
	this.degree=degree;
	}
	public void sinetorad()
	{
	double rad=Math.toRadians(degree);
	double sine = Math.sin(rad);
	System.out.println("The sine angle in radian="+sine);
	}
	public void cosinetorad()
	{
	double rad=Math.toRadians(degree);
	double cosine = Math.cos(rad);
	System.out.println("The cosine angle in radian="+cosine);
	}
	public void tantorad()
	{
	double rad=Math.toRadians(degree);
	double tangent = Math.tan(rad);
	System.out.println("The tangent angle in radian="+tangent);
	}
	public void cottorad()
	{
	double rad=Math.toRadians(degree);
	double cotvalue = 1/Math.tan(rad);
	System.out.println("The cot angle in radian="+cotvalue);
	}
	public void cosectorad()
	{
	double rad=Math.toRadians(degree);
	double cosecvalue = 1/Math.sin(rad);
	System.out.println("The cosec angle in radian="+cosecvalue);
	}
	public void sectorad()
	{
	double rad=Math.toRadians(degree);
	double secvalue = 1/Math.cos(rad);
	System.out.println("The sec angle in radian="+secvalue);
	}
}