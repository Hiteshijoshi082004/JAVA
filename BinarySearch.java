// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE
import java.util.Scanner;
public class BinarySearch{
  public static void main(String args[]){
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Binary Search Algorithm");
    System.out.println("-------------------------");
    int arr[] = {8,22,29,30,69,54};
    int size = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Integer you want to Search: ");
    int key = scan.nextInt();
    System.out.println("The element is at position: " + binarySearch(arr, 0, key, size-1));
  }
  public static int binarySearch(int arr[], int l, int x, int r){
    //The input takes an int array, position, and key element x which we need to search for as input and returns the position of x in arr
    while (l <= r) {
      int mid = (l + r) / 2;

      // If the element is in the middle
      if (arr[mid] == x) {
          return mid;

      // If element is smaller than mid, then it can only be present in left subarray so we decrease our r pointer to mid - 1 and search in left subarray
      } else if (arr[mid] > x) {
          r = mid - 1;

      // Else the element can only be present in right subarray so we increase our l pointer to mid + 1
      } else {
        l = mid + 1;
      }  
  }
  // return -1 if element is not in array
  return -1;
  }
}
