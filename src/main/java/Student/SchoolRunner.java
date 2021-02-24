package student;


import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //UserInput();
  Student stu = new Student("Hank",99,53);
  GraduateStudent gsto = new GraduateStudent("jack",50,70,80);

  gsto.print();

  stu.print();
        System.out.println("High score"+"\t"+stu.hightest());

    }

    private static void UserInput() {
        System.out.println("Please enter student's name");
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's english");
        int english =scanner.nextInt();
        System.out.println("Please enter student's math");
        int math =scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("Hight score:"+stu.hightest());
    }

}
