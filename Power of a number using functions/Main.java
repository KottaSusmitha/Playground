import java.util.*;
class Main
{
  public static int power(int b,int e)
  {
    int r=1;
    while(e!=0)
    {
      r*=b;
      --e;
    }
    return r;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int b1=in.nextInt();
    int e1=in.nextInt();
    int pow=power(b1,e1);
    System.out.println(pow);
  }
}



