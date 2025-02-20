import java.util.Scanner;
public class averageofarray {
   public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Average of array elements");
    System.out.println("-------------------------"); 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    float arr[]= new float[n];
 
     //entering values of array
    System.out.println("Enter the values in array: ");
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    float sum = 0;
 
    for(int i = 0;i<n;i++){
       sum += arr[i];
    }
 
    System.out.println("Average of all elements in array: " + (sum/(float)n));
   }
 }
 