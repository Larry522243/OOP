public class Main1006 {
    public static void main(String[] args) {
        Plus k = new Plus();
        k.setData(4, 3);
        k.print(4, 3);
        k.answer();

        Minus g = new Minus();
        g.setNum1(9);
        g.setNum2(5);
        g.answer();

        Plus.InnerPlus ss = k.new InnerPlus();
        ss.ppp();

        k.ss.ppp();
    }
}
