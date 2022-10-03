import java.util.*;

class Matrix {

	void add(int r,int c,int m1[][],int m2[][]) {
		System.out.println("The Addition of matrix is:");
		int sum[][] = new int[r][c];
		for (int i = 0; i <r; i++) {
			for (int j = 0; j< c; j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	void sub(int r,int c,int m1[][],int m2[][]) {
		System.out.println("The Subtraction of matrix is:");
		int sub[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sub[i][j] = m1[i][j] - m2[i][j];
				System.out.print(sub[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	void mul(int r,int c,int m1[][],int m2[][]) {
		System.out.println("The Multiplication of matrix is:");
		int mul[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mul[i][j] = 1;
				mul[i][j] = m1[i][j] * m2[i][j];
				System.out.print(mul[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	void tran(int r,int c,int m1[][]) {
		System.out.println("The Transpose of matrix is:");
		int Tra[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Tra[i][j] = m1[j][i];
				System.out.print(Tra[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	void scal(int r,int c,int m1[][]) {
		System.out.println("The Scaler_Multiplication of matrix is:");
		int Sca[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int k = 5;
				Sca[i][j] = k * m1[i][j];
				System.out.print(Sca[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
class MatTest {
	public static void main(String []args)
	{
        Scanner a=new Scanner(System.in);
	System.out.println("Enter the row of matrix:");
	int r=a.nextInt();
	System.out.println("Enter the column of  matrix:");
	int c=a.nextInt();
	int [][]m1=new int[r][c];
	int [][]m2=new int [r][c];
	
	System.out.println("Enter the elements in the first matrix:");
	for(int i=0;i<r;i++)
	{
	    for(int j=0;j<c;j++)
	    {
	        m1[i][j]=a.nextInt();
	    }
	}

	System.out.println("Enter the elements in the second matrix:");
	for(int i=0;i<r;i++)
	{
	    for(int j=0;j<c;j++)
	    {
	        m2[i][j]=a.nextInt();
	    }
      }
	System.out.println("THE FIRST MATRIX IS:");
	for(int i=0;i<r;i++)
	{
	    for(int j=0;j<c;j++)
	    {
	       System.out.print(m1[i][j]+" ");
	    }
	    System.out.println(" ");
	}

	System.out.println("THE SECOND MATRIX IS:");
	for(int i=0;i<r;i++)
	{
	    for(int j=0;j<c;j++)
	    {
	       System.out.print(m2[i][j]+" ");
	    }
	    System.out.println(" ");
	}
	Matrix obj=new Matrix();
	obj.add(r,c,m1,m2);
	obj.sub(r,c,m1,m2);
	obj.mul(r,c,m1,m2);
	obj.tran(r,c,m1);
	obj.scal(r,c,m2);
  }	
};
