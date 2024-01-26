import java.util.Scanner;

class Student {
    int roll;
    String name;
    int m1,m2,m3;

    void inputData() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the roll: ");
        roll = input.nextInt();

        System.out.print("Enter your name: ");
        input.next();
        name = input.nextLine();

        System.out.print("Enter 3 subject marks: ");
        m1 = input.nextInt();
        m2 = input.nextInt();
        m3 = input.nextInt();
    }

    void display() {
        System.out.println("Roll No.: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Sub1: " + m1);
        System.out.println("Sub2: " + m2);
        System.out.println("Sub3: " + m3);
        System.out.println("---------------------------------");
    }
}
