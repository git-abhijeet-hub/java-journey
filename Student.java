public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("I'm " + name + ", and I'm " + age + " years old.");
    }
}