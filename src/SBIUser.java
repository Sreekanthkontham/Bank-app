import java.util.Objects;
import java.util.UUID;

public class SBIUser implements bankInterface {



    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private static String password;
    private  double rateOfInterest;
    public SBIUser(String name,double balance,String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        SBIUser.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "this is updated balance"+balance;
    }

    @Override
    public String withDraw(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount > balance){
                return "insufficient funds";
            }
            else{
                balance = balance-amount;
                return "you have sufficient funds";
            }

        }
        else{
            return "Wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance+years+rateOfInterest)/100;
    }
}
