class App1 {
    private int x;
    private static int y = 100;

    public App1() {
        x = ++y;
    }

    public void display() {
        System.out.println("x: " + x + " y: " + y);
    }
}

class TestApp1 {
    public static void main(String[] args) {
        App1 a1 = new App1();
        App1 a2 = new App1();
        App1 a3 = new App1();

        a1.display();
        a2.display();
        a3.display();
    }
}
