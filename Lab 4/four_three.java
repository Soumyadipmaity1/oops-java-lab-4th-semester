class Apple {
    void show() {
        System.out.println("Apple's show()");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana's show()");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry's show()");
    }
}

public class four_three {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        apple.show();
        banana.show();
        cherry.show();
    }
}
