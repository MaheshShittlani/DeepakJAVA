public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        // p1.name = "Alex"; Error becoz of private
        // p1.age = 33; // Same error

        p1.setName("Alex");
        p1.setAge(33);

        // p2.name = "Clark";
        // p2.age = -45;
        p2.setName("Clark");
        p2.setAge(45);

        // System.out.println(p1.name + " | " + p1.age);
        // System.out.println(p2.name + " | " + p2.age);

        System.out.println(p1.getName() + " | " + p1.getAge());
        System.out.println(p2.getName() + " | " + p2.getAge());
        
        Person p3 = new Person();
        p3.setName("Blake");
        p3.setAge(-23);

        System.out.println(p3.getName() + " | " + p3.getAge());

    }
}
