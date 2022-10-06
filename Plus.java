public class Plus extends Clac implements PrintAnswer {

    @Override
    public void answer() {
        System.out.println(getNum1() + getNum2());
    }

    @Override
    public void print(int a, int b) {
        System.out.print(a + "+" + b + "=");
    }

    public class InnerPlus {
        int a;

        public void ppp() {
            System.out.println("pp");
        }
    }

    Plus.InnerPlus ss = new InnerPlus();
}
