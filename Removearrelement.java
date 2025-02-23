import java.util.Scanner;
public class Removearrelement {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Remove any specific element from an Array");
    System.out.println("-----------------------------------------");
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    //entering values of array
    System.out.println("Enter the values in array: ");
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the value you want to remove: ");
    int key = sc.nextInt();
    int indexKey = findIndex(arr, key);
    int arrNew[]= removeElement(arr, indexKey);
    System.out.println("New array: ");
    for(int i = 0; i<arrNew.length;i++){
        System.out.print(arrNew[i] + ", ");
    }
    }
    public static int findIndex(int arr[], int key){
        int index = -1;
        for(int i = 0; i<arr.length;i++){
        if(arr[i]==key) index = i;
        }
        return index;
    }
 
  public static int[] removeElement(int arr[], int index){
    int arr2[] = new int[arr.length - 1];
    if (index == 0) {
      for(int i = 1;i<arr.length;i++){
        arr2[i-1] = arr[i];
      }
    }
    else if (index == arr.length) {
      for(int i = 0; i<arr.length-1;i++){
        arr2[i]=arr[i];
      }
    }
    else{
      for(int i = 0; i<index;i++){
        arr2[i] = arr[i];
      }
      for(int i = index; i<arr.length-1;i++){
        arr2[i] = arr[i+1];
      }
    }
    return arr2;
  }
}
