class Student {

    String name;
    int age;
    int marks;

    Student() {
        name = "Unknown";
        age = 0;
        marks = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    void study() {
        System.out.println(name + " is studying");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    int add(int a, int b) {
        return a + b;
    }

    void show() {
        System.out.println("Student Details");
    }

    void show(String name) {
        System.out.println("Student Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Task7 {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("1. Default Constructor");
        s1.display();

        Student s2 = new Student("Teja", 21);

        System.out.println("2. Parameterized Constructor");
        s2.display();

        Student s3 = new Student("Ganesh", 22, 90);

        System.out.println("3. Constructor Overloading");
        s3.display();

        System.out.println("4. Accessing Fields");
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.marks);

        System.out.println("5. Calling Methods");
        s3.study();

        System.out.println("6. Method Parameters");
        s3.setMarks(95);

        System.out.println("7. Return Values");
        System.out.println("Marks: " + s3.getMarks());

        System.out.println("8. Method with Parameters and Return");
        System.out.println("Addition: " + s3.add(10, 20));

        System.out.println("9. Method Overloading");
        s3.show();
        s3.show("Ganesh");
        s3.show("Ganesh", 22);
    }
}