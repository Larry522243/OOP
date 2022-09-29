public class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("咖啡飲料", 200, 3);
        Drink oolongtea = new Drink("OO烏龍茶", 150, 2);
        Alcohol wine = new Alcohol("葡萄酒", 300, 2, 15.0f);

        Drink.printTitle();
        coffee.printData();
        oolongtea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();
        int sum = coffee.getTotalPrice() + oolongtea.getTotalPrice() + wine.getTotalPrice();
        System.out.printf("\n*** 總計金額 %d 元 ***", sum);
    }
}
