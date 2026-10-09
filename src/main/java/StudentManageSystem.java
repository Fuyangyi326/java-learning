import java.util.HashMap;
import java.util.Scanner;

public class StudentManageSystem {
    static HashMap<String, Student> students = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                showAllStudents();
            } else if (choice == 3) {
                findStudent();
            } else if (choice == 4) {
                deleteStudent();
            } else if (choice == 5) {
                System.out.println("再见！");
                break;
            } else {
                System.out.println("无效选项，请重新选择");
            }
        }
    }

    static void printMenu() {
        System.out.println("\n===== 学生管理系统 =====");
        System.out.println("1. 添加学生");
        System.out.println("2. 查看所有学生");
        System.out.println("3. 按学号查找学生");
        System.out.println("4. 删除学生");
        System.out.println("5. 退出");
        System.out.print("请选择：");
    }

    static void addStudent() {
     System.out.print("请输入学号：");
     String id=scanner.nextLine();

     if (students.containsKey(id)) {
         System.out.println("学号已存在！");
            return;
        }
     System.out.print("请输入姓名：");
     String name=scanner.nextLine();

     System.out.print("请输入年龄：");
     int age=scanner.nextInt();
     scanner.nextLine();

     System.out.print("请输入成绩:");
     int score=scanner.nextInt();
     scanner.nextLine();

     students.put(id, new Student(id, name, age, score));
     System.out.print("添加成功");
    }

    static void showAllStudents() {

    }

    static void findStudent() {

    }

    static void deleteStudent() {

    }
}