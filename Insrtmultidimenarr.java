import java.util.Scanner;
public class Insrtmultidimenarr 
{
   public static void main(String[] args){
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Insertion at specific position in multidimensional array");
        System.out.println("-------------------------------------------------------------"); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2d size of array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][]= new int[n][m];
        System.out.println("Enter the 2d location of element you want to insert: ");
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        System.out.println("Enter the element you want to add: ");
        arr[x][y] = sc.nextInt();
        System.out.print("Array: \n { ");
        for(int i = 0; i<n;i++){
            System.out.print("{ ");
            for(int j = 0; j<m;j++){
            System.out.print(arr[i][j] + ", ");
            }
            System.out.print(" } ");
        }
        System.out.print(" } ");
        }
 }
 
