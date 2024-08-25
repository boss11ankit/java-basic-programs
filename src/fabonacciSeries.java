import java.util.Scanner;
public class fabonacciSeries {
    public static void main(String[]args){
        int a=0,b=1,c;
        System.out.print("enter the no of terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
