public class Alcohol extends Drink {
    public float alcper;

    public Alcohol(String name, int price, int count, float alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("品名(度數[%])\t單價\t數量\t金額");
    }

    public void printData() {
        System.out.printf("%s(%.1f)\t%d\t%d\t" + getTotalPrice() + "\n", name, alcper, price, count);
    }
}
