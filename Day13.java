//Java program to print spy number

import java.util.Scanner;
class Day13
{
    public static void main(String args[])
    {
        int n,sum=0,product=1,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            l=n%10;
            sum=sum+l;
            product=product*l;
            n=n/10;
        }
        if(sum==product)
        System.out.println("the number is spy number");
        else
        {
            System.out.println("the number is not a spy number");
        }

    }
}

/*output: 
1. Enter a number: 217
217 is not a spy number

2. Enter a number: 132
132 is spy number

