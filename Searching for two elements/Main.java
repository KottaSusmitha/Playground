import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int c, n, search, array[];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (c = 0; c < n; c++)
        array[c] = in.nextInt();
        search = in.nextInt();
        int search1=in.nextInt();
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     
      {
         System.out.println(c);
          break;
      }
   }
   if (c == n) 
      System.out.println(-1);
      for (c = 0; c < n; c++)
    {
      if (array[c] == search1)     
      {
         System.out.println(c);
          break;
      }
   }
   if (c == n)  
      System.out.println(-1);
    }
}




