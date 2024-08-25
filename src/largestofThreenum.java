import java.util.Scanner;
public class largestofThreenum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("eenter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("enter third number: ");
        int num3 = sc.nextInt();
        int largest = Math.max(num1,Math.max(num2,num3));
        System.out.println("largest no among three is : " + largest);
    }
}
