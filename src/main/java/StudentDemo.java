public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("001", "fyy", 24, 100);
        Student s2 = new Student("002", "李四", 20, 92);

        s1.setAge(99);
        System.out.println("s1 年龄：" + s1.getAge());
        s2.setAge(-5);
        System.out.println("s2 年龄：" + s2.getAge());
    }
}

