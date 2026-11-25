import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        String regNo = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Mark 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter Mark 3: ");
        double mark3 = scanner.nextDouble();

        Student student = new Student(regNo, name, age, mark1, mark2, mark3);
        System.out.println();
        student.displayInformation();

        scanner.close();
    }
}
