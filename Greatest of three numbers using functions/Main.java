import java.util.Scanner;
class Main
{
   public static int great(int a,int b,int c)
   {
     int g;
     if((a>b)&&(a>c))
     {
       g=a;
     }
     else if((b>a)&&(b>c))
     {
       g=b;
     }
     else
     {
       g=c;
     }
     return g;
   }
   public static void main (String[] args)
   {
     Scanner in=new Scanner(System.in);
     int x=in.nextInt();
     int y=in.nextInt();
     int z=in.nextInt();
     int g1=great(x,y,z);
     System.out.println(g1);
     
   }
  
}