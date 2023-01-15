//Java Program to generate harmonic series//

import java.util.*;
class Day47
{
    public static void main(String[] args)
    {
        int num,i=1;
        double rst=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        num=in.nextInt();
        while(i<=num)
        {
            System.out.println("1/"+i+"+");
            rst=rst+(double)1/i;
            i++;
        }
        System.out.println("\n\n Sum of Harmonic Series is"+rst);
    }
}