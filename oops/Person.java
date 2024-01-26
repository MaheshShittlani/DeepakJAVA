public class Person {
    private String name;
    private int age;


    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if(a > 0) {
            age = a;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
