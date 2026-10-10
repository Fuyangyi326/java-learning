import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManageSystem {
    static HashMap<String, Student> students = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadStudents();
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
                saveStudents();
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
        String id = scanner.nextLine();

        if (students.containsKey(id)) {
            System.out.println("学号已存在！");
            return;
        }

        System.out.print("请输入姓名：");
        String name = scanner.nextLine();

        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        scanner.nextLine();

        students.put(id, new Student(id, name, age, score));
        System.out.println("添加成功！");
    }

    static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("暂无学生");
            return;
        }

        System.out.println("\n===== 所有学生 =====");
        for (String id : students.keySet()) {
            students.get(id).introduce();
        }
    }

    static void findStudent() {
        System.out.print("请输入要查找的学号：");
        String id = scanner.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("未找到该学生");
            return;
        }

        students.get(id).introduce();
    }

    static void deleteStudent() {
       System.out.print("请输入要删除的学号：");
       String id=scanner.nextLine();

       if(!students.containsKey(id)) {
           System.out.println("未找到该学生");
           return;
       }
        students.remove(id);
        System.out.println("删除成功！");
    }
    static void loadStudents() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 4) continue;
                String id = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                int score = Integer.parseInt(parts[3]);

                students.put(id, new Student(id, name, age, score));
            }
            reader.close();
        } catch (IOException e) { System.out.println("加载失败：" + e.getMessage());
        }
    }
    static void saveStudents() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));
            for (String id : students.keySet()) {
                Student s = students.get(id);
                writer.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getScore());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("保存失败：" + e.getMessage());
        }
     }
    }

