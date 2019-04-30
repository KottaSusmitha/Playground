import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i;
    int p=0,q=0,r=0;
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    if(n==9)
    {
      p=a[0]+a[1]+a[2];
    q=a[3]+a[4]+a[5];
    r=a[6]+a[7]+a[8];
    if(p==q && q==r)
    {
      System.out.println("Perfect Batch");
    }
    }
    if(n==6)
    {
      p=a[0]+a[1]+a[2];
    q=a[3]+a[4]+a[5];
   
    if(p==q )
    {
      System.out.println("Perfect Batch");
    }
      else
      {
        System.out.println("Not a Perfect Batch");
      }
    }
  }
}
