import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    int n, temp, r, s = 0, i, f;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
        temp=n;
		while( temp > 0)
		{
			f = 1; 
			i = 1; 
		    r = temp % 10;
		    while (i <= r)
		    {
		     	f*= i;
		     	i++;
		    }
		   	s = s + f;
		    temp=temp/10;
		}
		
			
		if ( n == s )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}