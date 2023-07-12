public interface bankInterface {
    double checkbalance();
    String addMoney(int amount);

    String withDraw(int amount,String password);
    double calculateInterest(int years);





}
