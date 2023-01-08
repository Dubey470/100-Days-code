//Java program to find the missing elements//
public class Day40
{
    public static void main(String[] args)
    {
        int a[]={1,2,4,5,7,8,10};
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("sum of given numbers:" +sum1);

        int sum2=0;
        for(int i=1;i<=10;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("sum of numbers b/w the range:" +sum2);
        System.out.println("missing numbers:"  + (sum2-sum1));
    }
}

/* output
sum of given number:37
sum of numbers b/w the range:55
missing number:18*/ 