import java.util.Scanner;
public class Day46
{
    public static void main(String[] args)
    {
        String username,password;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        username=sc.nextLine();
        System.out.println("Enter Password");
        password=sc.nextLine();
        if(username.equals("user")&& password.equals("user"));
        {
            System.out.println("Authentication Successfull");
        }
        else
        {
            System.out.println("Authentication failed");
        }
    }
}