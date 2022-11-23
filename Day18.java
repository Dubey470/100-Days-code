import java.util.Scanner;

public class Day18
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = sc.nextInt();
         boolean isKN = false;
         
        int square = n * n;
        int temp = square;
        int Digits = 0;
        
        while (temp > 0)
        {
            Digits++;
            temp /= 10;
        }
       
        for (int i = 1; i < Digits; i++)
        {
            int divisor = (int) Math.pow(10, i);
            int quotient = square / divisor;
            int remainder = square % divisor;
            if (quotient + remainder == n)
            {
                isKN = true;
            }
        }
        if (isKN)
        {
            System.out.println("It is Kaprekar number");
        } else
        {
            System.out.println("Not Kaprekar number");
        }
    }
}

/*output:
  45 =  (45)2 = 2025
2025 */
