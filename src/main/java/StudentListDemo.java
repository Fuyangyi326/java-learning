import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("张三", 18, 85));
        students.add(new Student("李四", 20, 92));
        students.add(new Student("王五", 19, 78));
        System.out.println("共 " + students.size() + " 个学生：");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            s.introduce();
        }
            students.add(new Student("赵六", 21, 88));
            System.out.println("\n加一个后，共 " + students.size() + " 个学生：");
            for (int i = 0; i < students.size(); i++) {
                students.get(i).introduce();
            }
            students.remove(0);
            System.out.println("\n删一个后，共 " + students.size() + " 个学生：");
            for (int i = 0; i < students.size(); i++) {
                students.get(i).introduce();
            }
        }
    }
  