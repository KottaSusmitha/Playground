
import java.util.*;
public class Main
{
    static void findThePairs(int inputArray[], int inputNumber)
    {
        
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+", "+inputArray[j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int inputArray[]=new int[n];
      for(int i=0;i<n;i++)
      {
        inputArray[i]=in.nextInt();
      }
      int inputNumber=in.nextInt();
      findThePairs(inputArray,inputNumber);
    }
}

