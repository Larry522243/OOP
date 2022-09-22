public class Human {
    String name;
    double height;
    double weight;
    private double bmi;

    public Human() {
        name = "Guest";
        height = 180;
        weight = 70;
        bmi = Math.round(weight / Math.pow((height / 100), 2) * 10.0) / 10.0;
    }

    public Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        bmi = Math.round(weight / Math.pow((height / 100), 2) * 10.0) / 10.0;
    }

    public void hello() {
        System.out.printf("HELLO!!!, My name is %s\n", name);

    }

    public double clacBMI() {
        return bmi;
    }

    public String myHealth() {
        String message = "";
        if (bmi < 18.5) {
            message = "太輕了";
        } else if (bmi < 25) {
            message = "正常";
        } else {
            message = "太重了";
        }
        return message;
    }
}
