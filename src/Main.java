import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("enter your name ,Deposit amount,password to create your Account");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        double balance = sc.nextDouble();

        String password = sc.next();

        SBIUser user = new SBIUser(name,balance,password);

        //addMoney
        String message = user.addMoney(5000);
        System.out.println(message);
        System.out.println();
       //withdraw money
        System.out.println("enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("enter your password");
        String pass  = sc.next();


        System.out.println(user.withDraw(money,pass));

        //calculate interest
        System.out.println(user.calculateInterest(2));

    }
}