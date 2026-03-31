import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    // Method to get input
    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // Method to display details
    void displayDetails() {
        System.out.println(name + " " + rollNo + " " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.getDetails();
        s.displayDetails();
    }
}