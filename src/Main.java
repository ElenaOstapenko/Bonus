// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int amount = 9000;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100 * 1;
        } else {
            bonus = 0;
        }
        balance = balance + amount + bonus;
        System.out.println(balance);
    }
}

