import java.util.Scanner;
class Day16
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        string str=in.nextLine();

        int count[]=new int[26];
        boolean flag=true;
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            continue;

            if(ch>='A' && ch<='Z')
            {
                count[ch-'A']++;
            }
            else if (ch>='a' && ch<='z')
            count[ch-'a']++;
            {
                for(int i=0;i<count.length;i++)
                if(count[i]==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.println("Its a pangram");
            else
            System.out.println("Not a pangram");
         }
     }
}

/*output:
Enter a string: Pack my box with five dozen liquor jugs.
Its a pangram

Enter a string: Hello vitians how are you:
Not a pangram*/


