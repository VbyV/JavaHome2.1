public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        int percent;
        if (amount >= 20) {
            percent = 5;
        } else {
            percent = 0;
        }
        int bonus = amount * percent / 100;
        System.out.println("Итоговый бонус: " + bonus);
    }
}
