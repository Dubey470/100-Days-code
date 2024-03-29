//Java Program to Check if an Array is Strictly Increasing
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Day45 {
    // Function to check array is strictly increasing or not.
    static boolean checkStrictlyIncreasing(int[] array){
        boolean result=true;
        int i;
        for(i=0;i<array.length-1;i++){
            if(array[i]>=array[i+1])
            {
                result=false;
                break;
            }
        }
        return result;
    }
 
    // Function to read the user input
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try{
            size=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            return;
        }
        int[] array=new int[size];
        System.out.println("Enter array elements");
        int i;
        for(i=0;i<array.length;i++){
            try{
                array[i]=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                System.out.println("An error occurred");
                return;
            }
        }
        boolean result=checkStrictlyIncreasing(array);
        if(result){
            System.out.println("Array is strictly increasing");
        }
        else{
            System.out.println("Array is not strictly increasing");
        }
    }
}