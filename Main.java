public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Larry";
        human1.height = 170;
        human1.weight = 80;

        Human human2 = new Human("cflin", 170, 80);

        human1.hello();
        human2.hello();
    }
}