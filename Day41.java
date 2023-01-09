// Java program to print Pythagores Triplet//

import java.util.Scanner;
public class Day41 {
    
    public static void Pythagorestriplet(int[] array){
        int i,j,k;
        int x,y,z;
        int count=0;
        for(i=0;i<array.length;i++){
            x=array[i];
            for(j=0;j<array.length;j++){
                y=array[j];
                for(k=0;k<array.length;k++){
                    z=array[k];
                    if((z*z)==(x*x + y*y)){
                        count++;
                        System.out.println(x+", "+y+", "+z);
                        return;
                    }
                }
            }
        }
        System.out.println("No pythagores exist in the array");
    }
    // Function to read user input
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        try {
            size = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid Size");
            return;
        }
        int[] array = new int[size];
        int i;
        System.out.println("Enter array elements");
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
            }
        }
        Pythagorestriplet(array);
    }
}