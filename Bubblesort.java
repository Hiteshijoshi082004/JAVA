import java.util.Scanner;
public class Bubblesort {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);  
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Bubble Sort Algorithm");
    System.out.println("-------------------------");
     
    System.out.print("Enter the size of Array ");  
    //reading the number of elements from the that we want to enter  
    int n=sc.nextInt();  
    //creates an array in the memory of length n 
    int[] array = new int[n];  
    System.out.println("Enter the elements of the array you want to sort: ");  
    for(int i=0; i<n; i++)  
    {  
    //reading array elements from the user   
    array[i]=sc.nextInt();  
    } 

    bubbleSort(array,array.length);

    System.out.println("Sorted Array: ");

    for(int i = 0;i<n;i++){
      System.out.print(array[i] + ", ");
    }
  }

  public static void bubbleSort(int[] arr, int n){
    //sorts the array 
    int i, j,temp;
    boolean swapped;
    for (i = 0; i < n - 1; i++) {
      swapped = false;
      for (j = 0; j < n - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
               
              // Swap arr[j] and arr[j+1]
              temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
              swapped = true;
          }
      }

      // If no two elements were
      // swapped by inner loop, then break
      if (swapped == false)
          break;
    }
  }
}

