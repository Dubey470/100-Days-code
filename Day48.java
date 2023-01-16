//Java program to restart the PC after few seconds.

import java.util.Scanner;
import java.io.*;
public class Day48{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbet in second");
        int sec=sc.nextInt();
        Runtime r=Runtime.getRuntime();
        try{
            System.out.println("The PC will restart after "+sec+" seconds");
            r.exec("shutdown -r -t" +sec);
        }
        catch(IOException e)
        {
            System.out.println("Exception:" +e);
        }
    }
} 