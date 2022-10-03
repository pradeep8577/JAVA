class PatternClass {
            
		public static void main(String[] args)
		{
			int k,m,year,d,c,res;
 			String[] day={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
			k=Integer.parseInt(args[0]);
		       m=Integer.parseInt(args[1]);
		      year=Integer.parseInt(args[2]);
		      int month;
		      if(m>2)
		     {
		    	 month=m;
		     }
		     else
		     {
		    	month=(12+m);
		    	year--;
		     }
		        d=year%100;
			c=year/100;
			int f=(k+((13*(month+1)-1)/5)+d+(d/4)+(c/4)-(2*c));
		        res=f%7;
			System.out.println(day[res]);
     }
}