import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)){
            System.out.print(str + " is palindrome");
        }
        else{
            System.out.print(str + " is not palindrome");
        }
    }
}
