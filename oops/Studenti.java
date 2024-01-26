import java.util.Scanner;

class Studenti {
    private int roll;
    private String name;
    private int m1,m2,m3;

    public void inputData() 
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

    public void display() {
        System.out.println("Roll No.: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Sub1: " + m1);
        System.out.println("Sub2: " + m2);
        System.out.println("Sub3: " + m3);
        System.out.println("Total: " + total());
        System.out.println("Per: " + per());
        System.out.println("Grade: " + grade());
        System.out.println("---------------------------------");
    }

    private int total() {
        return m1 + m2 + m3;
    }

    private float per() {
        return total() / 3.0f;
    }

    private char grade() {
        float p = per();

        if(p >= 85) return 'S';
        if(p >= 75) return 'A';
        if(p >= 65) return 'B';
        if(p >= 55) return 'C';
        if(p >= 50) return 'D';
        return 'F';
    }
}
 