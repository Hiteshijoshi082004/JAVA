import java.util.Scanner;
public class uppertolower {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("Convert String from upper to lower or vice-versa");
    System.out.println("----------------------------------------------------");
    System.out.println("Enter the string: ");
    String str1=sc.nextLine();  
    StringBuffer newStr=new StringBuffer(str1);  
      
    for(int i = 0; i < str1.length(); i++) {  
          
        //Checks for lower case character  
        if(Character.isLowerCase(str1.charAt(i))) {  
            //Convert it into upper case using toUpperCase() function  
            newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
        }  
        //Checks for upper case character  
        else if(Character.isUpperCase(str1.charAt(i))) {  
            //Convert it into upper case using toLowerCase() function  
            newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));  
        }  
    }  
    System.out.println("String after case conversion : " + newStr);  
  }  
}
