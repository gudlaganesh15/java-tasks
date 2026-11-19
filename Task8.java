class Person {

    private String name;
    private int age;

    Person() {
        System.out.println("Parent Default Constructor");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent Parameterized Constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int marks;

    Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
        System.out.println("Child Constructor");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

class Graduate extends Student {

    String course;

    Graduate(String name, int age, int marks, String course) {
        super(name, age, marks);
        this.course = course;
    }

    void showCourse() {
        System.out.println("Course: " + course);
    }
}

public class Task8 {

    public static void main(String[] args) {

        System.out.println("1. Encapsulation");

        Person p = new Person("Rahul", 21);

        System.out.println("2. Getters and Setters");

        p.setName("Arun");
        p.setAge(22);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        System.out.println("3. Inheritance");

        Student s = new Student("Priya", 20, 90);

        System.out.println("4. Method Overriding");

        s.display();

        System.out.println("5. Super Keyword");

        Graduate g = new Graduate("Sam", 23, 95, "Java");

        System.out.println("6. Multilevel Inheritance");

        g.display();
        g.showCourse();
    }
}