public class Drink {
    String name;
    int price;
    int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return count * price;
    }

    public static void printTitle() {
        System.out.println("品名\t\t單價\t數量\t金額");
    }

    public void printData() {
        System.out.printf("%s\t%d\t%d\t" + getTotalPrice() + "\n", name, price, count);
    }
}
