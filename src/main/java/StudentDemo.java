public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("fyy",24,100);
        s1.introduce();

        Student s2 = new Student("李四",20,92);
        s2.introduce();

        s1.setAge(99);
        System.out.println("s1 年龄：" + s1.getAge());
        s2.setAge(-5);
        System.out.println("s2 年龄：" + s2.getAge());
    }
}

