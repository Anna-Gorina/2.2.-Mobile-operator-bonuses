public class Main {
    public static void main(String[] args) {
        int accountClient = 350;
        int depositAmount = 2100;

        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        int amount = bonus + accountClient + depositAmount;
        System.out.println(amount);

    }
}
