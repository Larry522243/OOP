public class Novel extends Book {
    public String writer;

    public Novel() {
        title = "三國志";
        genre = "歷史類";
        writer = "ABC";
    }

    public void printNovel() {
        printBook();
        System.out.println("作者：" + writer);
    }
}
