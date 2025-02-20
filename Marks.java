// IMPORTING SCANNER CLASS FROM JAVA UTIL PACKAGE 
import java.util.Scanner;
class Marks{
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("Program to show use of Scanner Class");
        System.out.println("------------------------------------");
        // USING SCANNER CLASS HERE 
        Scanner in = new Scanner(System.in);
        // INITIALIZED THREE SUBJECTS
        int maths,science,social;
        System.out.println("Enter the numbers of three subjects:");
        maths=in.nextInt();
        science=in.nextInt();
        social=in.nextInt();
        System.out.println("MATHS:"+maths);
        System.out.println("SCEINCE:"+science);
        System.out.println("SOCIAL:"+social);
        int total=maths+science+social;
        // COMPUTED AVERAGE OF THREE SUBJECTS
        int avg=(total)/3;
        // COMPUTES PERCENTAGE OF THREE SUBJECTS
        double percentage=((double)total/300)*100;
        // ATLAST PRINTING THE AVEGRAGE AND PERCENTAGE COMPUTED
        System.out.println("Average of three subjects:"+avg);
        System.out.println("Percentage of three subjects:"+percentage);
    }
}