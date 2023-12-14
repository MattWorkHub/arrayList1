import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Gianni", 44);
        Student student2 = new Student("Gianna", 45);
        Student student3 = new Student("Giannino", 46);
        Student student4 = new Student("Giannone", 47);
        Student student5 = new Student("Janni", 48);
        Student student6 = new Student("Giannona", 49);
        Student student7 = new Student("Gian", 50);
        Student student8 = new Student("Giann", 51);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        System.out.println(students);
    }
}