class Trying
/*{// SUM****  1 *****
	public static void main(String[] args)
	{
		int input=9, square, rem=0, sum=0, add=0, copy=input;
		square= (int) Math.pow(input, 2);
		System.out.println(square);
		while(square!=0)
		{
			rem=square%10;//81%10=1
			square=square/10;//81/10=8
			sum=sum*10+rem;//0*10+1=1
			add=add+rem;//0+1=1//1+8=9
		}
		if(add==copy)
		{
		System.out.println("Evil number");
		}
		else
		{
		System.out.println("Not a Evil number");
		}
	
	}	
}*/


/*{   ******  SUM2 ********
	public static void main(String[] args)
	{
		int num=132, rem, sum=0, product=1;
		while(num!=0)
		{
		   	rem=num%10;
			num=num/10;
			System.out.println("rem is =" + rem);
			sum=sum+rem;
			product=rem*rem;
				
		}
		   System.out.println("sum is = " + sum );
		   System.out.println("product is = " + product);
		  
		
	}
}*/

/*{   //   ******** SUM=3 *******
	public static void main(String[] args)
	{
		int num=76, result=0, square=0, rem=0, copy;
		result=num*num;
		System.out.println(result);
		rem=result%100;
		System.out.println(rem);
		if(num==rem)
		{
			System.out.println("AUTOMATIC NUMBER");
		}
		else
		{
			System.out.println(" NOT A AUTOMATIC NUMBER");
		}
	}
	
}*/


{
	public static void main(String[] args)
	{
		int num=2025, rem=0, count=0;
		while(num!=0)
		{
			rem=num%10;
			count++;
			num=num/10;
		}
			System.out.println(" number of digits = " + count);
		
		
	}	
}






























