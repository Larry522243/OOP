public class Main0922 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Larry");
        human1.setHeight(170);
        human1.setWeight(80);

        Human human2 = new Human("cflin", 170, 80);

        System.out.println(human1.getName());

        human1.hello();
        human2.hello();
        System.out.println(human1.clacBMI() + "\n" + human1.myHealth());
    }
}