import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int i,s=0;
    for(i=1;i<=n;i++)
    {
      s+=i;
    }
    return s;
  }
  public static void main (String[] args)
  {
	 Scanner in=new Scanner(System.in);
     int r=in.nextInt();
     int r1=sum(r);
     System.out.print(r1);
	}
}