class App2 {
    public static int sum(int x, int y ) {
        return x + y;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static float avg(int x, int y) {
        return (x + y) / 2.0f;
    }
}


class TestApp2 {
    public static void main(String[] args) {
        System.out.println("5 + 6: " + App2.sum(5, 6));
        System.out.println("5 + 6: " + App2.max(5, 6));
        System.out.println("Avg<4,5> " + App2.avg(6,7) );
    }
}