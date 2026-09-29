public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "fyy";
        s1.age = 24;
        s1.score = 100;
        s1.age = 99;
        s1.introduce();

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 20;
        s2.score = 92;
        s2.introduce();
        System.out.println("s1 年龄改成：" + s1.age);
        System.out.println("s2 年龄：" + s2.age);
    }
}

