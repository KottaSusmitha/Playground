import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner in= new Scanner(System.in);
        int i,j,n;
        n=in.nextInt();
        for(j=1,i=1;j<=n;i=i+2,j++)
        {
          System.out.println(i);
	    }
     }
}