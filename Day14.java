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
//if equal, prints strontio number  
System.out.println(n+ " is a strontio number.");  
else  
//prints if not a strontio number  
System.out.println(n+ " is not a strontio number.");  
}  
}  