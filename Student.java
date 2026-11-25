public class Student {
    // Private attributes
    private String registrationNumber;
    private String name;
    private int age;
    private double mark1;
    private double mark2;
    private double mark3;

    // Parameterized constructor
    public Student(String registrationNumber, String name, int age, double mark1, double mark2, double mark3) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Getters and setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }

    // Calculates and returns the average of the three module marks
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    // Returns "PASS" if average is >= 50, otherwise "FAIL"
    public String getStatus() {
        return calculateAverage() >= 50.0 ? "PASS" : "FAIL";
    }

    // Displays all student information, including average and status
    public void displayInformation() {
        double average = calculateAverage();
        String status = getStatus();

        System.out.println("=== Student Information ===");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name:                " + name);
        System.out.println("Age:                 " + age);
        System.out.println("Mark 1:              " + mark1);
        System.out.println("Mark 2:              " + mark2);
        System.out.println("Mark 3:              " + mark3);
        System.out.printf("Average Mark:        %.2f%n", average);
        System.out.println("Academic Status:     " + status);
        System.out.println("=============================");
    }
}
