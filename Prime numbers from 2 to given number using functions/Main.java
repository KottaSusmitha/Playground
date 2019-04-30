import java.util.Scanner;
class Main
{
  public static int prime(int n)
  {
    int i, num;
    for(i=1;i<=n;i++)
    {
       int counter=0; 	  
       for(num =i; num>=1; num--)
	   {
             if(i%num==0)
	         {
 		        counter = counter + 1;
	         }
	   }
	   if (counter ==2)
	   {
	     System.out.println(i);
	   }	
    }
    return i;
    }
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      prime(n1);
    }
}