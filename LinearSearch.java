// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE
import java.util.Scanner;
public class LinearSearch {
  public static void main(String args[]){
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Linear Search Algorithm");
        System.out.println("-------------------------"); 
        int arr[] = {8,22,69,54,29,30};
        int size = arr.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer you want to Search: ");
        int key = scan.nextInt();
        System.out.println("The element is at position: " + linearSearch(arr, size, key));
  }
public static int linearSearch(int arr[], int n, int x){
    //The input takes an int array, its size n, and key element x which we need to search for as input and returns the position of x in arr
    for (int i = 0; i < n; i++)   
    { 
      // Return the index of the element if the element is found 
      if (arr[i] == x) 
          return i; 
    } 

    // return -1 if the element is not found 
    return -1; 
  }
}