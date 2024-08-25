import java.util.Scanner;
public class primeCheck{
    public static void main(String[]args){
        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i =2; i<=num/2 ; i++){
            if (num%i ==0){
                isPrime =false;
                break;
            }
        }
        if (isPrime){
            System.out.print(num + "is prime no");
        }
        else{
            System.out.print(num + "not prime no");
        }
    }
}
