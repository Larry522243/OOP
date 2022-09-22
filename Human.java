public class Human {
    String name;
    double height;
    double weight;

    public Human() {
    }

    public Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void hello() {
        System.out.printf("HELLO!!!, My name is %s\n", name);
    }
}
