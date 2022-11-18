// Java program to print Strontio number.

import java.util.*;  
public class Day14 
{  
public static void main(String args[])   
{  
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number: ");    
int num=sc.nextInt();  
int n=num;  

num=(num*2%1000)/10;  

  if(num%10==num/10)  
// print strontio number  
System.out.println(n+ " is a strontio number.");  
else  
//print if not a strontio number  
System.out.println(n+ " is not a strontio number.");  
}  
}  

/*  output:
Enter a number:1111
1111 is a strontio number.

Enter a number: 1875
1875 is not a strontio number */