class App1 {
    public static void main(String[] args) {
        System.out.println("Method Demo");
        int t = sum(5, 6);
        System.out.println("5 + 6 = " + t);
        float f = avg(5, 10);
        System.out.println("Average " + f);
    }

    public static int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static float avg(int a, int b) {
        return sum(a, b) / 2.0f;
    }
}