import java.util.Scanner;
public class reverseString{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed string: " +reversed);

    }
}