import java.util.Scanner;

public class Day15
{
    public static void main(String[] args)
    {
        int l, n, num;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            l = num % 10;
            if(l==0)
            {
                flag=true;
            }
            num = num / 10;
        }
        if(flag)
        {
            System.out.println("Its a Duck Number");
        }
        else
        {
            System.out.println("Its not Duck Number");
        }
        
    }
}

/*output:
Enter number:
0456
Its not a Duck number

Enter number:
3450
Its a duck number

