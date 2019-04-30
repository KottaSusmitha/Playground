import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int i; int max;
    int list[]=new int[n];
    for(i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    max=list[0];
    for(i=0;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
      }
    }
    
    int f=0;
    for(i=0;i<n;i++)
    {
      if(max==list[i])
      {
        f=i;
        break;
      }
    }
    System.out.println(f);
  }
}