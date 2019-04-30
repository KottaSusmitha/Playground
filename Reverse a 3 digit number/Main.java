import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int third=n/100;
    int s=n/10;
    int sec=s%10;
    int first=n%10;
    int digit=(first*100)+(sec*10)+third;
    System.out.println(digit);
  }
}