import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
    
    Scanner sc = new Scanner(System.in);
    
    String name;
    int age;
    
    System.out.println("Enter your name: ");
    name = sc.nextLine();
    
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    
    Student s1 = new Student(name, age);
    
    s1.introduce();

    sc.close();
}
}