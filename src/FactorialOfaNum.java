import java.util.Scanner;
public class FactorialOfaNum {
    public static void main(String[]args){
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("factorial of given no is : " +factorial);
    }
}
