import java.util.Scanner;
public class Main
{
  public static void gcd(int a,int b,int c)
   {
     int s;
     if((a>b)&&(a>c))
     {
       s=a;
     }
     else if((b>a)&&(b>c))
     {
       s=b;
     }
     else
     {
       s=c;
     }
     int g=1;
     for(int i = 1; i <= a && i <= b && i <= c; ++i)
        {
            
            if(a % i==0 && b % i==0 && c % i==0)
                g = i;
        }
    System.out.println(g);
  }
	public static void main (String[] args)
	{
	    Scanner in=new Scanner(System.in);
        int x=in.nextInt();
      int y=in.nextInt();
      int z=in.nextInt();
      gcd(x,y,z);
	}
}