import java.util.Scanner;

class Main{
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
	   int no, originalNumber, remainder, result = 0, n = 0;
         no=in.nextInt();
        originalNumber = no;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = no;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == no)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}