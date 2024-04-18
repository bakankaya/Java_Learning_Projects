import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fizzBuzz(n);
    }
    public static void fizzBuzz(int n){
        for(int i=1; i<=n; i++){
            if (i%5== 0 && i%3== 0){
                System.out.println(i + " FizzBuzz");
            } else if (i%5 == 0){
                System.out.println(i + " Buzz");
            } else if (i%3 == 0){
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            };
        };
    };
}
