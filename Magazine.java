public class Magazine extends Book {
    int day;

    public Magazine() {
        title = "電腦玩家";
        genre = "3C類";
        day = 10;
    }

    public void printMagazine() {
        printBook();
        System.out.println("出版日：" + day + "日");
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("aaa出版日：" + day + "日");
    }
}
