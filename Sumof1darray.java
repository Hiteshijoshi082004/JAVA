import java.util.Scanner;
public class Sumof1darray {
   public static void main (String[] args){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Sum of an single dimensional array");
    System.out.println("-------------------------");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array: ");
     int n = sc.nextInt();
     int arr[]= new int[n];
 
     //entering values of array
     System.out.println("Enter the values in array: ");
     for(int i = 0;i<n;i++){
       arr[i] = sc.nextInt();
     }
     int sum = 0;
     for(int i = 0;i<n;i++){
       sum += arr[i];
     }
     System.out.println("Sum of all elements in array: " + sum);
   }
 }
 